package Problems;

import java.util.Arrays;

public class HouseRobberII {
    public static int rob(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int[] skipFirst = Arrays.copyOfRange(nums, 1, nums.length);
        int[] skipLast = Arrays.copyOfRange(nums, 0, nums.length - 1);
        return Math.max(houseRobber(skipLast), houseRobber(skipFirst));
    }

    private static int houseRobber(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }

        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }
}
