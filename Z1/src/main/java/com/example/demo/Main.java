public class Main {
    public static void main(String[] args) {
        Player player = new Player(1, 1); // Начальные координаты игрока
        Enemy enemy = new Goblin(1, 3); // Начальные координаты врага
        Game game = new Game(player, enemy);
        game.start();
    }
}
