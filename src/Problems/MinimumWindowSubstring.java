package Problems;
import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s.equals(t)) {
            return s;
        }

        if ((t.length() > s.length()) || s.isEmpty() || t.isEmpty()) {
            return "";
        }

        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            int count = mapT.getOrDefault(t.charAt(i), 0);
            mapT.put(t.charAt(i), count + 1);
        }

        int need = mapT.size();
        int have = 0;
        int left = 0, right = 0;
        Map<Character, Integer> windowCounts = new HashMap<>();

        return "IN PROGRESS";
    }
}
