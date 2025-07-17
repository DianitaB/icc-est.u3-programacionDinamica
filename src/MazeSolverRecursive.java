import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MazeSolverRecursive implements MazeSolver {

    private List<List<Cell>> caminos = new ArrayList<>();

    public List<List<Cell>> getAllPaths(boolean[][] laberinto, Cell inicio, Cell fin) {
        caminos.clear();

        int[][] direcciones = {
            {1, 0},   // abajo
            {-1, 0},  // arriba
            {0, 1},   // derecha
            {0, -1}   // izquierda
        };

        for (int i = 0; i < direcciones.length; i++) {
            boolean[][] visitado = new boolean[laberinto.length][laberinto[0].length];
            List<Cell> camino = new ArrayList<>();
            camino.add(inicio);

            int filaNueva = inicio.row + direcciones[i][0];
            int colNueva = inicio.col + direcciones[i][1];

            buscar(laberinto, filaNueva, colNueva, fin, visitado, camino);
        }

        return caminos;
    }

    public void buscar(boolean[][] laberinto, int fila, int col, Cell fin,
                   boolean[][] visitado, List<Cell> camino) {

    if (fila < 0 || col < 0 || fila >= laberinto.length || col >= laberinto[0].length)
        return;
    if (!laberinto[fila][col] || visitado[fila][col])
        return;

    Cell actual = new Cell(fila, col);
    camino.add(actual);
    visitado[fila][col] = true;

    if (fila == fin.row && col == fin.col) {
        // Guardar el camino invertido (final al inicio)
        List<Cell> caminoInvertido = new ArrayList<>(camino);
        Collections.reverse(caminoInvertido);
        caminos.add(caminoInvertido);
    } else {
        buscar(laberinto, fila + 1, col, fin, visitado, camino); // abajo
        buscar(laberinto, fila - 1, col, fin, visitado, camino); // arriba
        buscar(laberinto, fila, col + 1, fin, visitado, camino); // derecha
        buscar(laberinto, fila, col - 1, fin, visitado, camino); // izquierda
    }

    camino.remove(camino.size() - 1);
    visitado[fila][col] = false;
}

    @Override
    public List<Cell> getPath(boolean[][] maze, Cell start, Cell end) {
        return new ArrayList<>();
    }
}
