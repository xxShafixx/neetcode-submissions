class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for (int i=0 ; i<s1.length ; i++) {
            m1.put(s1[i], m1.getOrDefault(s1[i], 0) +1);
        }

        for (int i=0 ; i<s2.length ; i++) {
            m2.put(s2[i], m2.getOrDefault(s2[i], 0) +1);
        }

        return m1.equals(m2);
    }
}
