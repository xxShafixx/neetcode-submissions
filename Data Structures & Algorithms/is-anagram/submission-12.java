class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        int[] ans = new int[26];

        for (int i=0 ; i<s1.length; i++) {
            ans[s1[i] - 'a']++;
            ans[s2[i] - 'a']--;
        }

        for (int i=0 ; i<ans.length ; i++) {
            if (ans[i] != 0) {
                return false;
            }
        }

        return true;
    
    }
}
