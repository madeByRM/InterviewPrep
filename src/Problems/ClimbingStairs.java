package Problems;

import java.util.HashMap;

public class ClimbingStairs {
    public static int topDown(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return topDownHelper(n, map);
    }

    private static int topDownHelper(int n, HashMap<Integer,Integer> map) {
        if (n <= 2) {
            return n;
        }
        if (!map.containsKey(n)) {
            map.put(n, topDownHelper(n - 1, map) + topDownHelper(n - 2, map));
        }
        return map.get(n);
    }

    public static int bottomUp(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
