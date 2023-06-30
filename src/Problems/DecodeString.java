package Problems;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String decodedString = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                countStack.push(count);
                i--;
            } else if (c == '[') {
                stringStack.push(decodedString);
                decodedString = "";
            } else if (c == ']') {
                StringBuilder subString = new StringBuilder(stringStack.pop());
                int repeatCount = countStack.pop();
                for (int j = 0; j < repeatCount; j++) {
                    subString.append(decodedString);
                }
                decodedString = subString.toString();
            } else {
                decodedString += c;
            }
        }
        return decodedString;
    }
}
