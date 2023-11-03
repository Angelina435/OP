import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Game {

    private EnemyFactory enemyFactory;
    private List<Enemy> enemies = new ArrayList<>();

    public Game(EnemyFactory enemyFactory) {
        this.enemyFactory = enemyFactory;
        // Создание врагов с использованием фабрики и добавление их в список врагов
        enemies.add(enemyFactory.createEnemy(3, 5));
        enemies.add(enemyFactory.createEnemy(6, 8));

    }
    private char[][] labyrinth = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', ' ', '#', ' ', '#', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };

    private Player player;
    private Enemy enemy;

    public Game(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
        labyrinth[player.getRow()][player.getCol()] = '@'; // Игрок
        labyrinth[enemy.getRow()][enemy.getCol()] = 'E'; // Враг
    }

    public void printLabyrinth() {
        for (char[] row : labyrinth) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public void movePlayer(String direction) {
        int newRow = player.getRow();
        int newCol = player.getCol();

        // Определяем новые координаты игрока в зависимости от направления
        if (direction.equals("вверх")) {
            newRow--;
        } else if (direction.equals("вниз")) {
            newRow++;
        } else if (direction.equals("влево")) {
            newCol--;
        } else if (direction.equals("вправо")) {
            newCol++;
        }

        // Проверяем, является ли новая клетка проходимой
        if (isValidMove(newRow, newCol)) {
            // Освобождаем старую позицию игрока
            labyrinth[player.getRow()][player.getCol()] = ' ';
            // Обновляем позицию игрока
            player.move(newRow, newCol);
            // Устанавливаем новую позицию игрока на карту
            labyrinth[newRow][newCol] = '@';
        }
    }

    private boolean isValidMove(int row, int col) {
        // Проверяем, что новые координаты находятся в пределах карты и являются проходимыми
        return row >= 0 && row < labyrinth.length && col >= 0 && col < labyrinth[0].length && labyrinth[row][col] != '#';
    }
    public void encounterEnemy() {
        if (player.getRow() == enemy.getRow() && player.getCol() == enemy.getCol()) {
            System.out.println("Вы встретили врага!");
            enemy.attack();
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printLabyrinth(); // Отображение карты лабиринта с игроком и врагом
            encounterEnemy();

            System.out.println("Введите направление (вверх, вниз, влево, вправо) или 'выход' для завершения:");
            String direction = scanner.nextLine().toLowerCase();

            if (direction.equals("выход")) {
                System.out.println("Игра завершена. До свидания!");
                break;
            }

            movePlayer(direction);
        }

        scanner.close();
    }
}
