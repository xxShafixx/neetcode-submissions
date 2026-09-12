class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        if (s1.length != t1.length) {
            return false;
        }

        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for(int i=0 ; i<s1.length ; i++) {
            if (m1.containsKey(s1[i])) {
                m1.put(s1[i], m1.get(s1[i]) +1);
            }
            else {
                m1.put(s1[i], 1);               
            }
        }

        for(int i=0 ; i<t1.length ; i++) {
            if (m2.containsKey(t1[i])) {
                m2.put(t1[i], m2.get(t1[i]) +1);
            }
            else {
                m2.put(t1[i], 1);               
            }
        }

        if (m1.equals(m2)) {
            return true;
        }
        return false;
    }
}
