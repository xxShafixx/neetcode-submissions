class Solution {
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }

        int l = 0;
        int lMax = height[0];
        int r = height.length -1;
        int rMax = height[r];
        int ans = 0;

        while (l<r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(height[l], lMax);
                ans = ans + (lMax - height[l]);
            } else {
                r--;
                rMax = Math.max(height[r], rMax);
                ans = ans + (rMax - height[r]);
            }
        }
        return ans;
    }
}
