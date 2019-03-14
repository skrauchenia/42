import java.util.*;
import java.lang.*;
import java.io.*;

public class ATM {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int requestValue = sc.nextInt();
        float balance = sc.nextFloat();

        if (requestValue % 5 != 0) {
            System.out.println(balance);
        } else {
            float withdrawSum = requestValue + 0.5f;
            if (withdrawSum > balance) {
                System.out.println(balance);
            } else {
                System.out.println(balance - withdrawSum);
            }
        }
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }


        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public float nextFloat() throws IOException {
            return Float.parseFloat(next());
        }


    }
}
