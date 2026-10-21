class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i=1 ; i<piles.length ; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }

        int l=1;
        int r=max;
        int ans = r;

        while (l<=r) {
            int mid = l + (r-l)/2;

            long time = 0;
            for (int pile : piles) {
                time += Math.ceil((double) pile / mid);
            }

            if (time <= h) {
                ans = mid;
                r = mid -1;
            } else {
                l = mid +1;
            }
        }

        return ans;
    }
}
