package Problems;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        // We initialize all elements of dp to 1 because each number is initially considered a subsequence of length 1.
        Arrays.fill(dp, 1);

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                // For each element at index i, we compare it with all the previous elements from index 0 to i-1.
                //If nums[i] is greater than nums[j], it means we can extend the increasing subsequence ending at index
                // j by including nums[i]. We update dp[i] to the maximum value between its current value and dp[j] + 1
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int longest = 0;
        for (int c : dp) {
            longest = Math.max(longest, c);
        }
        return longest;
    }
}
