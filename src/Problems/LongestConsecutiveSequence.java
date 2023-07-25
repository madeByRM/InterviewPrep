package Problems;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Create a HashSet to store all the elements from the array for fast look-up.
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLen = 0;
        for (int num : nums) {
            // If it's not present, it means the current element is the starting element of a new sequence.
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLen = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLen++;
                }

                maxLen = Math.max(maxLen, currentLen);
            }
        }
        return maxLen;
    }
}
