import java.util.*;
import java.lang.*;
import java.io.*;

public class FLOW001 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int testCasesCount = sc.nextInt();

        for (int i = 0; i < testCasesCount; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x + y);
        }
    }

    static final class Scanner {
        private BufferedInputStream inp;
        private int offset = 0;
        private int size = 1024 * 50;
        private byte[] buff = new byte[size];

        private Scanner(InputStream inputStream) {
            inp = new BufferedInputStream(inputStream);
            try {
                inp.read(buff, 0, size);
            } catch (IOException ignored) {
            }
        }

        public String nextString() {
            return new String(buff);
        }

        public int nextInt() {
            int i = offset;

            while (i < buff.length && (buff[i] == ' ' || buff[i] == '\t' || buff[i] == '\n')) {
                i++;
            }
            int sign = 1;
            if (i < buff.length && buff[i] == '-') {
                sign = -1;
            }

            int parsedInt = 0;
            while (i < buff.length && buff[i] >= '0' && buff[i] <= '9') {
                parsedInt *= 10;
                parsedInt += buff[i] - '0';
                i++;
            }

            if (i == buff.length) {

                int j = 0;
                for (; offset < buff.length; j++, offset++) {
                    buff[j] = buff[offset];
                }

                try {
                    inp.read(buff, j, size - j);
                } catch (IOException ignore) {
                }

                offset = 0;
                parsedInt = nextInt();
            } else {
                offset = i;
            }
            return parsedInt * sign;
        }
    }
}