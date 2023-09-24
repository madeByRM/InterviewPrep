package Problems;

public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        // Initialize the slow and fast pointers to the first element.
        // Similar to what we do with Linked list cycle. Instead of head, first array element
        int slow = nums[0];
        int fast = nums[0];

        // Move the slow pointer one step and the fast pointer two steps at a time until they meet.
        do {
            // Move the slow pointer one step ahead.
            slow = nums[slow];
            // This line moves the fast pointer two steps ahead in each iteration of the loop.
            fast = nums[nums[fast]];
            // Continue until slow and fast meet (cycle detected).
        } while (slow != fast);

        // Reset one of the pointers to the beginning of the array and move both pointers one step at a time until they meet again.
        slow = nums[0];
        while (slow != fast) {
            // Move both pointers one step at a time.
            slow = nums[slow];
            fast = nums[fast];
            // Continue until they meet again at the duplicate number.
        }

        // Return the duplicate number.
        return slow;
    }
}
