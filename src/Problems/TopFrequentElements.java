package Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        // Create a PriorityQueue (max-heap) to store numbers based on their frequencies.
        // We use a lambda comparator to sort by frequency in descending order.
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for (int n : map.keySet()) {
            maxHeap.add(n);
        }

        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}
