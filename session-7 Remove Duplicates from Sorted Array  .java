import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2};

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println(k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}


Your Output
2
1 2 