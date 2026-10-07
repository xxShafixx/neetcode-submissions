class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        for (int i=0 ; i<s1.length() ; i++) {
            m1.put(s1.charAt(i), m1.getOrDefault(s1.charAt(i), 0) +1);
        }

        int need = m1.size();

        for (int i=0 ; i<s2.length() ; i++) {
            HashMap<Character, Integer> m2 = new HashMap<>();
            int curr = 0;

            for (int j=i ; j<s2.length() ; j++) {
                m2.put(s2.charAt(j), m2.getOrDefault(s2.charAt(j), 0) +1);
                if (m2.get(s2.charAt(j)) > m1.getOrDefault(s2.charAt(j), 0)) {
                    break;
                }

                if (m2.get(s2.charAt(j)) == m1.getOrDefault(s2.charAt(j), 0)) {
                    curr++;
                }

                if (curr == need) {
                    return true;
                }
            }
        }
        return false;
    }
}
