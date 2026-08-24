import java.io.*;
import java.util.*;

public class Main {

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        String[] days = {
            "SUNDAY",
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY",
            "SATURDAY"
        };

        return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        if (input == null || input.trim().isEmpty()) {
            return;
        }

        StringTokenizer st = new StringTokenizer(input);

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int year = Integer.parseInt(st.nextToken());

        System.out.println(findDay(month, day, year));
    }
}


Output:
The repeated error proves the problem is input handling, not Calendar.

Your platform is running Main.main() with no input, so Scanner.nextInt() crashes. If this is the standard HackerRank Java Date and Time problem, you should submit only the method below.

public static String findDay(int month, int day, int year) {
    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, day);
    String[] days = {
        "SUNDAY",
        "MONDAY",
        "TUESDAY",
        "WEDNESDAY",
        "THURSDAY",
        "FRIDAY",
        "SATURDAY"
    };
    return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
}

If your editor specifically requires a complete Main class, then use this input-safe version:

import java.io.*;
import java.util.*;
public class Main {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        String[] days = {
            "SUNDAY",
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY",
            "SATURDAY"
        };
        return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input == null || input.trim().isEmpty()) {
            return;
        }
        StringTokenizer st = new StringTokenizer(input);
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int year = Integer.parseInt(st.nextToken());
        System.out.println(findDay(month, day, year));
    }
}


Output:

WEDNESDAY