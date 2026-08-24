import java.io.*;

public class Main {

    static boolean isLeap(int year) {
        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }

    static int toDays(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int total = 0;

        for (int y = 1971; y < year; y++) {
            total += isLeap(y) ? 366 : 365;
        }

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        for (int m = 1; m < month; m++) {
            total += days[m - 1];

            if (m == 2 && isLeap(year)) {
                total++;
            }
        }

        return total + day;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        if (line == null || line.trim().isEmpty()) {
            return;
        }

        String[] input = line.trim().split("\\s+");

        String date1 = input[0];
        String date2 = input[1];

        int answer = Math.abs(toDays(date1) - toDays(date2));

        System.out.println(answer);
    }
}


Output:
That error is not caused by your algorithm. The judge is failing to launch the Java program:

/usr/bin/time: missing program to run

Given the errors you’ve been getting across these problems, your platform likely expects a complete Java program with Main, but its execution setup may be broken.

For a normal Java compiler that expects Main, use this exact code:

import java.io.*;
public class Main {
    static boolean isLeap(int year) {
        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }
    static int toDays(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int total = 0;
        for (int y = 1971; y < year; y++) {
            total += isLeap(y) ? 366 : 365;
        }
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        for (int m = 1; m < month; m++) {
            total += days[m - 1];
            if (m == 2 && isLeap(year)) {
                total++;
            }
        }
        return total + day;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) {
            return;
        }
        String[] input = line.trim().split("\\s+");
        String date1 = input[0];
        String date2 = input[1];
        int answer = Math.abs(toDays(date1) - toDays(date2));
        System.out.println(answer);
    }
}


Output:

1