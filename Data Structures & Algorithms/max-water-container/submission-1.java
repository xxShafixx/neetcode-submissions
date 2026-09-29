class Solution {
    public int maxArea(int[] heights) {
        int ans=0;
        int l=0;
        int r=heights.length -1;

        while (l<r) {
            int temp = (r-l) * Math.min(heights[l], heights[r]);
            ans = Math.max(ans, temp);

            if(heights[l] <= heights[r]) {
                 l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}
