public class Maze {
    private boolean[][] grid;

    public Maze(boolean[][] grid) {
        this.grid = grid;
    }

    public boolean[][] getGrid() {
        return grid;
    }

    public void printMaze() {
        for (boolean[] row : grid) {
            for (boolean cell : row) {
                System.out.print(cell ? " -  " : "  * ");
            }
            System.out.println();
        }
    }
    public boolean[][] getGridRows() {
        return grid;
    }
}
