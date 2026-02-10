class Solution {
    public boolean isIsomorphic(String s, String t) {
        if( s.length() != t.length()){
            return false;
        }
        Map<Character,Character> hash = new HashMap<>();

        for ( int i = 0 ; i < s.length() ; i++){
            char original = s.charAt(i);
            char replacement  = t.charAt(i);
            if( !hash.containsKey(original)){
                if(!hash.containsValue(replacement)){
                    hash.put(original,replacement);
                }
                else{
                    return false;
                }
            }
            else{
                char mappedchar = hash.get(original);
                if( mappedchar != replacement ){
                    return false;
                }
            }
            
        }
        return true ;
    }
}