package Problems;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        // We use two stacks: countStack to keep track of counts, and stringStack to keep track of substrings.
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String decodedString = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character c is a digit (0-9),
            // we extract the count by continuously reading digits until a non-digit character is encountered.
            // We then push this count onto the countStack.
            if (Character.isDigit(c)) {
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                countStack.push(count);
                i--;
            } else if (c == '[') {
                // If the current character is '[', push the current decodedString onto the stringStack.
                stringStack.push(decodedString);
                decodedString = ""; // Reset decodedString for the upcoming substring.
            } else if (c == ']') {
                // If the current character is ']', it means we have completed decoding a substring.
                // We need to pop the last decodedString from stringStack and repeat it.
                StringBuilder subString = new StringBuilder(stringStack.pop());
                int repeatCount = countStack.pop();
                for (int j = 0; j < repeatCount; j++) {
                    // Append the repeated substring to the previous decodedString.
                    subString.append(decodedString);
                }
                // Update decodedString to the newly decoded substring.
                decodedString = subString.toString();
            } else {
                // If the current character is not a digit, '[', or ']', it's part of the current substring.
                // Append it to the decodedString.
                decodedString += c;
            }
        }
        return decodedString;
    }
}
