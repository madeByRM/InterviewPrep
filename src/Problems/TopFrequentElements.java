package Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        // If the element is already in the map, it increments its count by 1 using map.getOrDefault(num, 0) + 1,
        // and if the element is not present, it sets the count to 1.
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // pq will order its elements based on the frequency counts (values) of the elements in ascending order.
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
        );

        // pq will hold the top k frequent elements based on their frequency counts.
        for (Map.Entry<Integer, Integer> data : map.entrySet()) {
            pq.add(data);
            //  it removes the element with the lowest priority (smallest frequency count)
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int i = k;
        // populate the result array in reverse order (highest frequency elements first).
        while (!pq.isEmpty()) {
            result[--i] = pq.poll().getKey();
        }

        return result;
    }
}
