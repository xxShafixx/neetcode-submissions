class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        int[] counts = new int[26];

        for (int i=0 ; i<s1.length ; i++) {
            counts[s1[i] - 'a']++;
            counts[s2[i] - 'a']--;
        }

        for (int i=0 ; i<counts.length ; i++) {
            if (counts[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
