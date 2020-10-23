package w2;

import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, int m) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (long i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current) % m;
        }

        return current;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int m = scanner.nextInt();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}

