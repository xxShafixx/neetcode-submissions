class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] string = s.toCharArray();
        int l = 0;
        int ans = 0;

        for (int r=0 ; r<s.length() ; r++) {
            if (map.containsKey(string[r])) {
                l = Math.max((map.get(string[r]) +1), l);
            }
            map.put(string[r], r);
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}
