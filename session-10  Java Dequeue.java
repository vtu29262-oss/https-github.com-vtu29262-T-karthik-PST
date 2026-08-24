iimport java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        StringBuilder input = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            input.append(line).append(" ");
        }

        if (input.length() == 0) {
            return;
        }

        StringTokenizer st = new StringTokenizer(input.toString());

        int n = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String a = st.nextToken();
            String b = st.nextToken();

            set.add(a + " " + b);

            System.out.println(set.size());
        }
    }
}


Output
Status :Successfully executed