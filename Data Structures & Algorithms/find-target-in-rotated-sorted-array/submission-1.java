class Solution {
private int binarySearch(int[] nums, int target, int left, int right) {
    while (left <= right) {
        int mid = left + (right - left)/2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid +1;
        } else {
            right = mid -1;
        }
    }
    return -1;
}

    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n -1;

        while (l<r) {
            int m = l + (r-l)/2;
            if (nums[m] > nums[r]) {
                l = m +1;
            } else {
                r = m;
            }
        }
        int pivot = l;
        int ans = binarySearch(nums, target, 0, pivot -1);
        if (ans != -1) {
            return ans;
        } else {
            return binarySearch(nums, target, pivot, n -1);
        }

    }
}
