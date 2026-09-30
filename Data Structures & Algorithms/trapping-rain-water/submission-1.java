class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if (n==0) {
            return 0;
        }

        int ans = 0;
        int[] lMax = new int[n];
        lMax[0] = height[0];
        int[] rMax = new int[n];
        rMax[n-1] = height[n-1];
        
        for (int i=1 ; i<n ; i++) {
            lMax[i] = Math.max(lMax[i-1], height[i]);
        }

        for (int j=n-2 ; j>=0 ; j--) {
            rMax[j] = Math.max(rMax[j+1], height[j]);
        }

        for (int i=0 ; i<n ; i++) {
            ans = ans + (Math.min(lMax[i], rMax[i]) - height[i]);
        }
        return ans;
    }
}
