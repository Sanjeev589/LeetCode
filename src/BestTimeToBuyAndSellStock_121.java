public class BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        int minVal = prices[0];
        int maxProfit =0;
        for(int i=0; i< prices.length; i++){
            minVal = Math.min(minVal, prices[i]);
            int profit = prices[i] - minVal;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
