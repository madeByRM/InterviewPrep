package Problems;

public class TrappingRainWater {
    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                }
                int water = leftMax - height[left];
                totalWater += water;
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                }
                int water = rightMax - height[right];
                totalWater += water;
                right--;
            }
        }
        return totalWater;
    }
}
