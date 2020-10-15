package w2;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
  private static BigInteger calc_fib(int n) {
    if (n <= 1)
      return BigInteger.valueOf(n);

    BigInteger[] fibs = new BigInteger[n];
    fibs[0] = BigInteger.valueOf(0);
    fibs[1] = BigInteger.valueOf(1);

    for (int i = 2; i <= n; i++) {
      BigInteger fib = fibs[i - 1].add(fibs[i - 2]);
      fibs[i] = fib;
    }

    System.out.println(fibs.length);

    return fibs[n - 1];
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
