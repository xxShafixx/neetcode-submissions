class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        char[] string = s.toCharArray();
        for (int i=0 ; i<s.length() ; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j=i ; j<s.length() ; j++) {
                if (set.contains(string[j])) {
                    break;
                } else {
                    set.add(string[j]);
                }
            }
            ans = Math.max(ans, set.size());
        }
        return ans;
    }
}
