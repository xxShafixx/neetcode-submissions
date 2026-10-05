class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int l = 0;
        int r = 1;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                ans = Math.max(ans, prices[r] - prices[l]);
            } else {
                l = r;
            }
            r++;
        }
        return ans;
    }
}
