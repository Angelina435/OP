public class OrcFactory implements EnemyFactory {
    @Override
    public Enemy createEnemy(int row, int col) {
        return new Orc(row, col);
    }
}
