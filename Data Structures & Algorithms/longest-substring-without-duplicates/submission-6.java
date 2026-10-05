class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        char[] string = s.toCharArray();
        int l = 0;
        int r = 0;

        while (r<s.length()) {
            while (set.contains(string[r])) {
                set.remove(string[l]);
                l++;
            }
            set.add(string[r]);
            ans = Math.max(ans, (r-l+1));
            r++;
        }
        return ans;
    }
}
