package w1;

import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (index1 == -1 || numbers[index1] < number) {
                index1 = i;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if ((index2 == -1 && (index1 != i)) || (index1 != i) && numbers[index2] < number) {
                index2 = i;
            }
        }

//        System.out.println(index1 + ", " + index2);

        return (long) numbers[index1] * numbers[index2];
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
