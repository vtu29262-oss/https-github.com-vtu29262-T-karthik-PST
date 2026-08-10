interface PerformOperation {
    boolean check(int num);
}

public class Main {

    // Lambda for Odd / Even
    public static PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

    // Lambda for Prime / Composite
    public static PerformOperation isPrime() {
        return num -> {
            if (num < 2) {
                return false;
            }

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        };
    }

    // Lambda for Palindrome
    public static PerformOperation isPalindrome() {
        return num -> {
            int original = num;
            int reverse = 0;

            while (num > 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }

            return original == reverse;
        };
    }

    public static void main(String[] args) {

        // Test cases
        int[][] input = {
            {1, 4},
            {2, 5},
            {3, 898},
            {1, 3},
            {2, 12}
        };

        for (int[] test : input) {

            int condition = test[0];
            int number = test[1];

            PerformOperation operation;

            if (condition == 1) {
                operation = isOdd();

                System.out.println(
                    operation.check(number) ? "ODD" : "EVEN"
                );

            } else if (condition == 2) {
                operation = isPrime();

                System.out.println(
                    operation.check(number) ? "PRIME" : "COMPOSITE"
                );

            } else if (condition == 3) {
                operation = isPalindrome();

                System.out.println(
                    operation.check(number)
                    ? "PALINDROME"
                    : "NOT PALINDROME"
                );
            }
        }
    }
}

Output
Status :Successfully executed
Time:
0.0500 secs
Memory:
38.832 Mb
Your Output
EVEN
PRIME
PALINDROME
ODD
COMPOSITE

