package Problems;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        // Create a deque to store indices of elements
        Deque<Integer> dq = new ArrayDeque<>();
        // Create a list to store maximum values for each window
        List<Integer> result = new ArrayList<>();

        // Iterate for the first window of size k
        for (int i = 0; i < k; i++) {
            // Remove indices of smaller elements from the back of the deque
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }
            // Add the current index to the end of the deque
            dq.offerLast(i);
        }
        // Add the maximum element in the first window to the result list
        result.add(nums[dq.peekFirst()]);

        // Iterate for the rest of the windows
        for (int i = k; i < nums.length; i++) {
            // Remove index that goes out of the current window's left boundary
            if (dq.peekFirst() == i - k) {
                dq.pollFirst();
            }
            // Remove indices of smaller elements from the back of the deque
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }
            // Add the current index to the end of the deque
            dq.offerLast(i);
            // Add the maximum element in the current window to the result list
            result.add(nums[dq.peekFirst()]);
        }

        // Convert the result list to an integer array and return
        return result.stream().mapToInt(i -> i).toArray();
    }
}
