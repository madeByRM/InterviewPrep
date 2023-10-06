package Problems;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> group(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        // sort word and use it as key for hashmap i.e. Map<SortedWord, List<Words>>
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!anagramMap.containsKey(key)) {
                anagramMap.put(key, new ArrayList<>());
            }
            anagramMap.get(key).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
