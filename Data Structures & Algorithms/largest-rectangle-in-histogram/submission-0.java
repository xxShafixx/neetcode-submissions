class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int ans = 0;
        ArrayDeque<int[]> stack = new ArrayDeque<>();

        for (int i=0 ; i<n ; i++) {
            int start = i;
            while (!stack.isEmpty() && heights[i] < stack.peek()[1]) {
                int[] popped = stack.pop();
                int prevIndex = popped[0];
                int prevHeight = popped[1];

                ans = Math.max(ans, prevHeight * (i-prevIndex));

                start = prevIndex;
            }
            stack.push(new int[]{start, heights[i]});
        }

        while (!stack.isEmpty()) {
            int[] popped = stack.pop();
            ans = Math.max(ans, popped[1] * (n-popped[0]));
        }
        return ans;
    }
}
