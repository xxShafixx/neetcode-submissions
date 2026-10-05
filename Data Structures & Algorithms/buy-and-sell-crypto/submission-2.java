class Solution {
    public int maxProfit(int[] prices) {
        int least = prices[0];
        int ans = 0;

        for (int i=1 ; i<prices.length ; i++) {
            ans = Math.max(ans, prices[i] - least);
            least = Math.min(least, prices[i]);
        }
        return ans;
    }
}
