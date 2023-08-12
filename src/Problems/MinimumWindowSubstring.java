package Problems;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s.equals(t)) {
            return s;
        }

        if ((t.length() > s.length()) || s.isEmpty() || t.isEmpty()) {
            return "";
        }

        // Assuming ASCII character set
        int[] targetFreq = new int[128];
        int[] windowFreq = new int[128];

        // Count the frequency of characters in string t
        for (char c : t.toCharArray()) {
            targetFreq[c]++;
        }

        int left = 0; // Left pointer of the sliding window
        int minLen = Integer.MAX_VALUE; // Minimum window length found so far
        int minStart = 0; // Starting index of the minimum window substring
        int matched = 0; // Count of characters from string t that are currently in the window

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (targetFreq[c] > 0) {
                windowFreq[c]++;
                if (windowFreq[c] <= targetFreq[c]) {
                    matched++;
                }
            }

            while (matched == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);

                if (targetFreq[leftChar] > 0) {
                    windowFreq[leftChar]--;
                    if (windowFreq[leftChar] < targetFreq[leftChar]) {
                        matched--;
                    }
                }
                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(minStart, minStart + minLen);
    }
}
