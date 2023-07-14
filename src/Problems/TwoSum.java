package Problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a map to store the complement of each number and its index
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (complementMap.containsKey(complement)) {
                // Return the indices of the two numbers
                return (new int[] {complementMap.get(complement), i});
            } else {
                // Add the current number and its index to the map
                complementMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
