package Problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleHistogram {
    /*
    The solution uses stack data structure as well as iterating through the heights. Each element of the heights array
    is treated as potential minimum height of the largest rectangle. When we reach a height smaller than the previous
    one while iterating, we have found a potential maximum rectangle (with the bar at top of the stack being the smallest).
    We pop elements from the stack continuously until we find a height smaller or equal to the current one, and for each
    popped bar, we calculate area of rectangle with the popped bar height as smallest bar. we calculate the area and
    update the maximum area if current rectangle area is more.
    This approach works because the stack always holds the bars with heights in increasing order from bottom to up.
    Once the stack is empty, we start a new rectangle with the current bar. This way we are guaranteed to not miss any
    possible largest rectangle.
     */
    public static int largestRectangleArea(int[] heights) {
        // Create a stack to keep track of indices of bars in the histogram
        Deque<Integer> stack = new ArrayDeque<>();
        // Push a sentinel value -1 onto the stack (placeholder for empty stack)
        stack.push(-1);
        int length = heights.length;
        int maxArea = 0;

        for (int i = 0; i < length; i++) {
            // Process bars while they are taller or equal to the current bar
            while ((stack.peek() != -1) && (heights[stack.peek()] >= heights[i])) {
                int currHeight = heights[stack.pop()];  // Pop the index and get its height
                int currWidth = i - stack.peek() - 1;  // Calculate the width of the current rectangle
                maxArea = Math.max(maxArea, currWidth * currHeight);
            }
            stack.push(i);  // Push the current bar's index onto the stack
        }

        // Handle remaining bars in the stack
        while (stack.peek() != -1) {
            int currHeight = heights[stack.pop()];
            int currWidth = length - stack.peek() - 1;
            maxArea = Math.max(maxArea, currHeight * currWidth);
        }
        return maxArea;
    }
}
