package Problems;

import java.util.Stack;

public class LongestAbsoluteFilePath {
    public static int lengthLongestPath(String input) {
        // Split the input string based on the newline character ('\n') to get an array of strings representing
        // each line in the file system.
        String[] lines = input.split("\n");

        // Initialize a stack to store the lengths of the directories in the current path. The stack will be used to
        // keep track of the lengths as we traverse the file system.
        Stack<Integer> stack = new Stack<>();

        // Initialize a variable maxLen to store the maximum length of the absolute path to a file encountered so far.
        int maxLen = 0;

        for (String line : lines) {
            // Count the number of leading tabs
            // lastIndexOf returns last index of character \t (\t is considered as a one character)
            // depth is calculated as the num of tabs + 1
            int depth = line.lastIndexOf('\t') + 1;

            // Remove the tabs from the beginning of the line to get the name of the directory/file.
            int len = line.length() - depth;

            // Pops directories from the stack as long as the depth is less than the current stack size.
            // This step ensures that the stack only contains directories at the current depth or higher.
            while (depth < stack.size()) {
                stack.pop();
            }

            if (line.contains(".")) {
                // If the line represents a file, it updates maxLen with the maximum length between the
                // current length (len) and the length at the top of the stack (stack.peek()) plus len.
                // If the stack is empty, it means the file is at the root level, consider only the current length.
                maxLen = Math.max(maxLen, stack.isEmpty() ? len : stack.peek() + len);
            } else {
                //If the line represents a directory, it pushes the length of the current directory onto the stack.
                // The length is obtained by adding len to the top of the stack (stack.peek()) and adding 1 to account
                // for the directory separator ("/").
                stack.push((stack.isEmpty() ? 0 : stack.peek()) + len + 1);
            }
        }
        return maxLen;
    }
}
