class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] leftMax = new int[n];
        leftMax[0] = nums[0];
        int[] rightMax = new int[n];
        rightMax[n -1] = nums[n -1];

        for (int i=1 ; i<n ; i++) {
            if (i % k == 0) {
                leftMax[i] = nums[i];
            } else {
                leftMax[i] = Math.max(leftMax[i-1], nums[i]);
            }

            if ((n-i-1) % k == 0) {
                rightMax[n-i-1] = nums[n-i-1];
            } else {
                rightMax[n-i-1] = Math.max(nums[n-i-1], rightMax[n-i]);
            }
        }

        int[] ans = new int[n-k+1];

        for (int i=0 ; i<n-k+1 ; i++) {
            ans[i] = Math.max(leftMax[i+k-1], rightMax[i]);
        }

        return ans;
    }
}
