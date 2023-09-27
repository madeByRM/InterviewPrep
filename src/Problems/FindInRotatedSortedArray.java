package Problems;

public class FindInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right  - left) / 2;

            // Case 1: find target
            if (nums[mid] == target) {
                return mid;
            }
            /*
                If nums[left] <= nums[mid], it means the left half of the array is sorted.
                If nums[left] <= target < nums[mid], set right = mid - 1 to search in the left half.
                Otherwise, set left = mid + 1 to search in the right half.
                If nums[mid] <= nums[right], it means the right half of the array is sorted.
                If nums[mid] < target <= nums[right], set left = mid + 1 to search in the right half.
                Otherwise, set right = mid - 1 to search in the left half.
            */
            // Case 2: sub-array on mid's left is sorted
            else if (nums[mid] >= nums[left]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                // Case 3: sub-array on mid's right is sorted
            } else {
                if (target <= nums[right] && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
