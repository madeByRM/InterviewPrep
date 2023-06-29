package Problems;

public class ValidPalindrome {

    public boolean isPalindromeBruteForce(String s) {
        String cleanInput = "";
        String reversedInput = "";
        s = s.toLowerCase();
        for (Character ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)){
                cleanInput += ch;
            }
        }
        char[] arr = cleanInput.toCharArray();
        for (int i = arr.length-1; i >= 0; i--) {
            reversedInput += arr[i];
        }
        return cleanInput.equals(reversedInput);
    }

    /*
    In this code, we first clean the input string s by converting it to lowercase and removing
    non-alphanumeric characters using the replaceAll method.
    Then, we use two pointers, left and right, initialized to the start and end of the cleaned string,
    respectively. We compare characters at these pointers while incrementing left and decrementing right.
    If any characters don't match, we return false, indicating that the string is not a palindrome.
    If we reach a point where left is greater than or equal to right, all characters have matched,
    and we return true, indicating that the string is a palindrome.

    Time complexity: O(n) Space complexity: O(1)
     */
    public boolean isPalindromeOptimized(String s) {
        String cleanInput = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = cleanInput.length() - 1;

        while (left < right) {
            if (cleanInput.charAt(left) != cleanInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
