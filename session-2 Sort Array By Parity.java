import java.util.Arrays;

public class Main {

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSortAscending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int findMinimum(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int findMaximum(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findSum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static double findAverage(int[] arr) {

        return (double) findSum(arr) / arr.length;
    }

    public static void main(String[] args) {

        // No Scanner needed
        int[] numbers = {
            45, 12, 89, 3, 67, 25, 10, 34
        };

        System.out.println("JAVA SORT PROGRAM");
        System.out.println("=================");

        System.out.println("\nOriginal Array:");
        displayArray(numbers);

        // Ascending sort
        int[] ascending = Arrays.copyOf(numbers, numbers.length);

        bubbleSortAscending(ascending);

        System.out.println("\nAscending Order:");
        displayArray(ascending);

        // Descending sort
        int[] descending = Arrays.copyOf(numbers, numbers.length);

        bubbleSortDescending(descending);

        System.out.println("\nDescending Order:");
        displayArray(descending);

        // Minimum
        System.out.println("\nMinimum Value:");
        System.out.println(findMinimum(numbers));

        // Maximum
        System.out.println("\nMaximum Value:");
        System.out.println(findMaximum(numbers));

        // Sum
        System.out.println("\nSum:");
        System.out.println(findSum(numbers));

        // Average
        System.out.println("\nAverage:");
        System.out.println(findAverage(numbers));

        // Java built-in sorting
        int[] javaSort = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(javaSort);

        System.out.println("\nUsing Arrays.sort():");
        displayArray(javaSort);

        System.out.println("\nProgram completed successfully.");
    }
}


Your Output
JAVA SORT PROGRAM
=================

Original Array:
45 12 89 3 67 25 10 34 

Ascending Order:
3 10 12 25 34 45 67 89 

Descending Order:
89 67 45 34 25 12 10 3 

Minimum Value:
3

Maximum Value:
89

Sum:
285

Average:
35.625

Using Arrays.sort():
3 10 12 25 34 45 67 89 

