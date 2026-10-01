class Solution {
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }

        int l=0;
        int lMax = height[l];
        int r=height.length -1;
        int rMax = height[r];
        int ans = 0;

        while (l<r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                ans = ans + (lMax - height[l]);
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                ans = ans + (rMax - height[r]);
            }
        }
        return ans;
    }
}
