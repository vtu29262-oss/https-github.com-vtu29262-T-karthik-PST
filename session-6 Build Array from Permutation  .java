import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(ans));
    }
}


Your Output
[0, 1, 2, 4, 5, 3]