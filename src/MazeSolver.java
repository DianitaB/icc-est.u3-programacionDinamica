import java.util.List;

public interface MazeSolver {
    List<Cell> getPath(boolean[][] maze, Cell start, Cell end);
}
