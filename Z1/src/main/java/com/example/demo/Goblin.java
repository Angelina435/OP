public class Goblin implements Enemy {
    private int row;
    private int col;

    public Goblin(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getCol() {
        return col;
    }

    @Override
    public void attack() {
        System.out.println("Гоблин атакует с маленьким топором.");
    }
}
