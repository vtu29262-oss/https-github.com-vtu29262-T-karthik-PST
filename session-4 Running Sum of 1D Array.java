import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        System.out.println(Arrays.toString(nums));
    }
}


Your Output
[1, 3, 6, 10]

