package Problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSsWoRepeatingChars {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int left = 0;
        int right = 0;
        int maxLength = 0;
        char[] charArray = s.toCharArray();
        Set<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(charArray[right])) {
                set.add(charArray[right]);
                maxLength = Math.max(maxLength, set.size());
                right++;
            } else {
                set.remove(charArray[left]);
                left++;
            }
        }
        return maxLength;
    }
}
