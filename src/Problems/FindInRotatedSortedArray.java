package Problems;

public class FindInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

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
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
