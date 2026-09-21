class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i=0 ; i<strs.length ; i++) {
            int[] count = new int[26];
            for (int j=0 ; j<strs[i].length() ; j++) {
                char[] s = strs[i].toCharArray();
                count[s[j] - 'a']++;
            }
            map.putIfAbsent(Arrays.toString(count), new ArrayList<>());
            map.get(Arrays.toString(count)).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
