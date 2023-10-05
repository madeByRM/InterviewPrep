package Problems;

public class BestTimeToBuySellStock {
    public int maxProfitBruteForce(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int prof = prices[j] - prices[i];
                if (maxProfit < prof) {
                    maxProfit = prof;
                }
            }
        }
        if (maxProfit < 0) {
            maxProfit = 0;
        }
        return maxProfit;
    }
    /*
    In this code, we iterate through the prices array and update the minPrice if we find a smaller price.
    If the current price minus the minPrice is greater than the maxProfit, we update the maxProfit accordingly.
    Finally, we return the maxProfit.
    Time complexity: O(n)
     */
    public int maxProfitOptimized(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}
