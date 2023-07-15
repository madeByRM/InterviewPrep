package Problems;

import sun.java2d.loops.ScaledBlit;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int maxHeight = Math.min(height[left], height[right]);
            int width = right - left;
            maxArea = Math.max(maxArea, calculateArea(width, maxHeight));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    private static int calculateArea(int width, int length) {
        return width * length;
    }
}
