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
            int start = 0;
            // counts occurrence of the curr char in curr window
            int count = 0;

            // iterate over input string and increase the count
            for (int end = 0; end < s.length(); end++) {
                // If the current character matches the current unique letter, increase the count
                if (s.charAt(end) == c) {
                    count++;
                }
                // While the window is no longer valid (more characters to be replaced than allowed)
                // move the start pointer forward to shrink the window
                while (!isWindowValid(start, end, count, k)) {
                    // If the character at the start of the window matches the current unique letter,
                    // decrease the count as the character will be removed from the window
                    if (s.charAt(start) == c) {
                        count--;
                    }
                    // Move the start pointer forward to shrink the window
                    start++;
                }
                maxLength = Math.max(maxLength, end + 1 - start);
            }
        }
        return maxLength;
    }

    private static boolean isWindowValid(int start, int end, int count, int k) {
        // If the number of characters to be replaced is less than or equal to k, the window is valid.
        return end + 1 - start - count <= k;
    }
}
