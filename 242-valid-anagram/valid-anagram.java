class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sx = s.toCharArray();
        char[] tx = t.toCharArray();
        if ( s.length() != t.length()) return false ;
        Arrays.sort(sx);
        Arrays.sort(tx);
        return Arrays.equals(sx,tx);
    }
}