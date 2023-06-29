package Problems;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagramBruteForce(String s, String t) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        for (char ch : s.toCharArray()) {
            int occur = 1;
            if (!h1.containsKey(ch)){
                h1.put(ch, occur);
            } else {
                h1.put(ch, h1.get(ch) + 1);
            }
        }
        for (char ch : t.toCharArray()) {
            int occur = 1;
            if (!h2.containsKey(ch)){
                h2.put(ch, occur);
            } else {
                h2.put(ch, h2.get(ch) + 1);
            }
        }
        return h1.equals(h2);
    }

    /*
    In this code, we first check if the lengths of the strings s and t are different.
    If they are, we can immediately return false as they cannot be anagrams.
    Next, we convert the strings into character arrays using the toCharArray method.
    Then, we sort both arrays using the Arrays.sort method.
    Finally, we compare the sorted arrays using Arrays.equals. If the arrays are equal,
    it means that t is an anagram of s, and we return true. Otherwise, we return false.
    Time Complexity: O(n log n)  Space Complexity: O(n)
     */
    public boolean isAnagramOptimized(String s, String t) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert the strings to character arrays and sort them
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compare the sorted character arrays
        return Arrays.equals(sChars, tChars);
    }
}
