package Problems;

import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingCharReplace {
    public static int characterReplacement(String s, int k) {
        Set<Character> allLetters = new HashSet<>();

        // Create set with unique characters from input string
        for (int i = 0; i < s.length(); i++) {
            allLetters.add(s.charAt(i));
        }

        int maxLength = 0;

        for (Character c : allLetters) {
            int left = 0;
            int count = 0;

            for (int right = 0; right < s.length(); right++) {
                if (s.charAt(right) == c) {
                    count++;
                }
                while (!isWindowValid(left, right, count, k)) {
                    if (s.charAt(left) == c) {
                        count--;
                    }
                    left++;
                }
                maxLength = Math.max(maxLength, right + 1 - left);
            }
        }
        return maxLength;
    }

    private static boolean isWindowValid(int start, int end, int count, int k) {
        return end + 1 - start - count <= k;
    }
}
