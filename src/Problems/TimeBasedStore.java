package Problems;

import java.util.*;

/* Using Binary Search and Custom Pair Class
public class TimeBasedStore {
    static Map<String, List<Pair>> map;
    public TimeBasedStore() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        List<Pair> list = map.get(key);
        return search(list, timestamp);
    }

    private String search(List<Pair> list, int timeStamp) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int mid = start + (end - start + 1) /2;
            if (list.get(mid).getTimeStamp() <= timeStamp) {
                start = mid;
            } else {
                end = mid - 1;
            }
        }

        return list.get(start).getTimeStamp() <= timeStamp ? list.get(start).getValue() : "";
    }

    @Override
    public String toString() {
        return map.toString();
    }
}

class Pair {
    String value;
    int timeStamp;

    public Pair(String value, int timeStamp) {
        this.value = value;
        this.timeStamp = timeStamp;
    }

    public String getValue(){
        return this.value;
    }

    public int getTimeStamp(){
        return this.timeStamp;
    }
}
 */

/*
This solution uses TreeMap in Java which is a Red-Black Tree based NavigableMap implementation.
floorKey method in TreeMap returns the greatest key less than or equal to the given key,
or null if there is no such key which helps us find the greatest timestamp smaller than or equal to the given timestamp.
 */
public class TimeBasedStore {
    private Map<String, TreeMap<Integer, String>> map;

    public TimeBasedStore() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) {
            map.put(key, new TreeMap<>());
        }
        map.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        // FloorKey returns the greatest key less than or equal to the given key, or null if there is no such key
        Integer k = map.get(key).floorKey(timestamp);
        return k != null ? map.get(key).get(k) : "";
    }
}
