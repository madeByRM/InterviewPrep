package Problems;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        // subtracts start time to sort. If -, a < b; If +, a > b
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Using priority queue as minHeap, to store end-times in ascending order.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Iterate through the sorted intervals
        for (int[] interval : intervals) {
            int startTime = interval[0];
            int endTime = interval[1];

            // If minHeap is empty: there are no ongoing meetings, new room must be assigned
            // Check if start-time is greater than or equal to smallest end-time in the heap. If yes, remove end-time.
            if (!minHeap.isEmpty() && startTime >= minHeap.peek()) {
                minHeap.poll();
            }
            // offer new end-time to heap, it will be automatically sorted
            minHeap.offer(endTime);
        }
        return minHeap.size();
    }
}
