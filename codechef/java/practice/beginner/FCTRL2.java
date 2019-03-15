import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

public class FCTRL2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int n = sc.nextInt();
            BigInteger factorial = BigInteger.valueOf(1);

            while (n > 0) {
                factorial = factorial.multiply(BigInteger.valueOf(n));
                n--;
            }

            System.out.println(factorial);
        }
    }


}