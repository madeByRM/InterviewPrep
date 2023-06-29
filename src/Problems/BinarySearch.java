package Problems;

public class BinarySearch {
    /*
    In this code, the binarySearch method takes an array nums and a target value as input.
    It initializes the left pointer to the beginning of the array and the right pointer to the end of the array.
    The method enters a while loop that continues until the left pointer is less than or equal to the right pointer.
    Within the loop, it calculates the middle index using the formula mid = left + (right - left) / 2.
    The method then compares the value at the middle index with the target value.
    If they are equal, it returns the middle index as the location of the target.
    If the middle value is less than the target, it updates the left pointer to mid + 1
    to search in the right half of the array. If the middle value is greater than the target,
    it updates the right pointer to mid - 1 to search in the left half of the array.
    Time Complexity: O(log n)
     */
    public int search(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
