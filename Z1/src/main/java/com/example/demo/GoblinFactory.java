public class GoblinFactory implements EnemyFactory {
    @Override
    public Enemy createEnemy(int row, int col) {
        return new Goblin(row, col);
    }
}
