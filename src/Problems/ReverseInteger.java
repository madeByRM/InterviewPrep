package Problems;

public class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            int newResult = result * 10 + digit;

            // checking for overflow
            if ((newResult - digit) / 10 != result) {
                return 0;
            }

            result = newResult;
            x = x / 10;
        }
        return result;
    }
}