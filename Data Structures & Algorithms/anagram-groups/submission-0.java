class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i=0 ; i<strs.length ; i++) {
            //String s = Arrays.sort(strs[i]);
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
