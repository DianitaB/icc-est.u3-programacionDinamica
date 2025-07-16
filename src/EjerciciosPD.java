import java.util.HashMap;
import java.util.Map;

public class EjerciciosPD {

    public long getFibonacci(int n) {
        if (n <= 1)
            return n;

        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public long getFibonacciPD(int n) {
        Map<Integer, Long> caching = new HashMap<>();
        return getFibonacciPDHelper(n, caching);
    }

    private long getFibonacciPDHelper(int n, Map<Integer, Long> caching) {
        if (n <= 1)
            return n;

        if (caching.containsKey(n))
            return caching.get(n);

        long resultado = getFibonacciPDHelper(n - 1, caching) + getFibonacciPDHelper(n - 2, caching);
        caching.put(n, resultado);
        return resultado;
    }
}
