class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for ( String s : strs){
            char[] key = s.toCharArray();
            Arrays.sort(key);
            String res = new String(key);
            map.putIfAbsent(res , new ArrayList<>());
            map.get(res).add(s);
            
        }
        return new ArrayList<>(map.values());
    }
}
