package Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
        );

        for (Map.Entry<Integer, Integer> data : map.entrySet()) {
            pq.add(data);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int i = k;
        while (!pq.isEmpty()) {
            result[--i] = pq.poll().getKey();
        }

        return result;
    }
}
