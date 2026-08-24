import java.io.*;
import java.util.*;

public class Main {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0) {
                    return -1;
                }
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ' && c != -1);

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            int num = 0;

            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num * sign;
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        int k = fs.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextInt();
        }

        // First window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxUnique = map.size();

        // Slide the window
        for (int i = k; i < n; i++) {

            // Add new element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // Remove old element
            int removed = arr[i - k];

            if (map.get(removed) == 1) {
                map.remove(removed);
            } else {
                map.put(removed, map.get(removed) - 1);
            }

            maxUnique = Math.max(maxUnique, map.size());
        }

        System.out.println(maxUnique);
    }
}


Your Output
0