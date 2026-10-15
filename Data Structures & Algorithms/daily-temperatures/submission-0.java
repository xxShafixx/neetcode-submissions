class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        for (int i=0 ; i<n ; i++) {
            int counter = 0;
            for (int j=i+1 ; j<n ; j++) {
                counter++;
                if (temperatures[j] > temperatures[i]) {
                    ans[i] = counter;
                    break;
                }
            }
        }
        return ans;
    }
}
