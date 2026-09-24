class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0 ; i<nums.length ; i++) {
            int temp = target - nums[i];
            int l = i+1;
            int r = nums.length -1;

            int ans = -1;
            while(l<=r) {
                int mid = l + (r - l)/2;
                if (nums[mid] == temp) {
                    ans = mid;
                    r = mid - 1;
                } else if (nums[mid] < temp) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            if (ans != -1) {
                return new int[]{i+1, ans+1};
            }
        }
        return new int[0];
    }
}
