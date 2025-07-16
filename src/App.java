public class App {
    public static void main(String[] args) throws Exception {
        runEjerciciosPD();
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
}
