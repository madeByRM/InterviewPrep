package Problems;

import java.util.Arrays;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[] freqS1 = new int[26];

        for (int i = 0; i < n; i++) {
            // subtracting the ASCII value of 'a' from the character's ASCII value maps 'a' to index 0...
            freqS1[s1.charAt(i) - 'a']++;
        }
        int[] freqS2 = new int[26];
        for (int j = 0; j < m; j++) {
            freqS2[s2.charAt(j) - 'a']++;
            // sliding window has moved past the length of s1
            if (j >= n) {
                freqS2[s2.charAt(j - n) - 'a']--;
            }
            if (Arrays.equals(freqS1, freqS2)) {
                return true;
            }
        }
        return false;
    }
}
