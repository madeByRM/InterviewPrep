package Problems;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        // Initialize left to 1 (minimum possible eating speed)
        // Initialize right to the maximum pile size (maximum possible eating speed)
        int left = 1, right = 1;

        // Find the maximum pile size
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        // Perform binary search
        while (left < right) {
            // Calculate the middle value
            int mid = left + (right - left) / 2;
            // total hours spent eating bananas
            int hourSpent = 0;

            // Check if all bananas can be eaten at the current speed (mid)
            for (int pile : piles) {
                // Calculate the number of hours needed to eat the pile at speed mid
                // Using Math.ceil to round up if needed
                hourSpent += (int) Math.ceil((double) pile / mid);
            }

            // If all bananas can be eaten within h hours at speed mid,
            // update the right bound to mid to search for a smaller speed
            if (hourSpent <= h) {
                right = mid;
            } else {
                // Otherwise, update the left bound to mid + 1
                // to search for a faster eating speed
                left = mid + 1;
            }
        }
        return right;
    }
}
