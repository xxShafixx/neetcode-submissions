class Solution {
    public String minWindow(String s, String t) {
        if (t.length() == 0) {
            return "";
        }

        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i=0 ; i<t.length() ; i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) +1);
        }

        HashMap<Character, Integer> window = new HashMap<>();
        int have = 0;
        int need = tMap.size();
        int[] ans = {-1, -1};
        int ansLen = Integer.MAX_VALUE;
        int l = 0;

        for (int r=0 ; r<s.length() ; r++) {
            window.put(s.charAt(r), window.getOrDefault(s.charAt(r), 0) +1);
            if (window.get(s.charAt(r)).equals(tMap.getOrDefault(s.charAt(r), 0))) {
                have++;
            }
            while (have == need) {
                if ((r-l+1) < ansLen) {
                    ansLen = r-l+1;
                    ans[0] = l;
                    ans[1] = r;
                }
                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) -1);
                if (window.get(leftChar) < tMap.getOrDefault(leftChar, 0)) {
                    have--;
                }
                l++;
            }
        }
        if (ansLen == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(ans[0], ans[1] +1);
        }
    }
}
