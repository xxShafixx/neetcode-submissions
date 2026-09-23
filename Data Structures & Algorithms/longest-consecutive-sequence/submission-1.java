class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i=0 ; i<nums.length ; i++) {
            set.add(nums[i]);
        }

        int ans = 0;

        for (int i=0 ; i<nums.length ; i++) {
            if (!set.contains(nums[i] -1)) {
                int length = 1;
                while (set.contains(nums[i] + length)) {
                    length++;
                }
                ans = Math.max(ans, length);
            }
        }
        return ans;
    }
}
