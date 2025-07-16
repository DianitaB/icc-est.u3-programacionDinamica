import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // runEjerciciosPD();
        runMaze();
    }
    
    private static void runEjerciciosPD(){
            EjerciciosPD ejerciciosPD = new EjerciciosPD();
            System.out.println("DIANA BORJA");
            System.out.println();
            System.out.println("Fibonacci Recursivo:");
            long start =  System.nanoTime();
            long resultado = ejerciciosPD.getFibonacci(50);
            long end =  System.nanoTime();
            long duration = end - start;
            System.out.println("Resultado: " + resultado + ", Tiempo: " + duration + " ms");


            System.out.println("Fibonacci Recursivo Caching");
            start =  System.nanoTime();
            resultado = ejerciciosPD.getFibonacciPD(50);
            end = System.nanoTime();
            duration = end - start;
            System.out.println("Resultado: " + resultado + ", Tiempo: " + duration + " ms");

        }
    private static void runMaze() {
        boolean [][] predefinedMaze = {
            {true, true, true, true},
            {false, true, true,true},
            {true, true, false,false},
            {true, true, true, true}
        };
        Maze maze = new Maze(predefinedMaze);
        System.out.println(" Laberinto cargado:");
        maze.printMaze();
        Cell start = new Cell(0, 0);
        Cell end = new Cell(3, 3);

        List<MazeSolver> solvers = Arrays.asList(
            new MazeSolverRecursive());
        MazeSolver solver = solvers.get(0);
        List<Cell> path;
        path = solver. getPath(maze.getGrid(), start, end);

        System.out.println("\nCamino encontrado: ");
        System.out.println(path);
    }
}
