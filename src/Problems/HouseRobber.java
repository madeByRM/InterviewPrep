package Problems;

public class HouseRobber {
    public static int rob(int[] nums) {
        // nums.length + 1 instead of nums.length is to have an extra space for the base cases E.g. dp[0]
        int[] dp = new int[nums.length + 1];

        // The base cases are set: dp[0] is 0 because there's no house to rob,
        // and dp[1] is nums[0] because there's only one house to rob.
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }

        // last element of the array stores maximum
        return dp[nums.length];
    }
}
