package Problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;
    }

    private static void generate(List<String> result, String current, int open, int close, int n) {
        // Base case: If the length of the current string is equal to 2 * n,
        // it means we've generated a complete well-formed combination
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generate(result, current + "(", open + 1, close, n);
        }
        if (close < open) {
            generate(result, current + ")", open, close + 1, n);
        }
    }
}
