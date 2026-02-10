class Solution {
    public boolean rotateString(String s, String goal) {
        int len = s.length();
        StringBuilder sx = new StringBuilder(s);
        StringBuilder gx = new StringBuilder(goal);
        char id = gx.charAt(0);
        if( sx.length() != gx.length()) return false;
        while( len-- > 0 ){
             if( sx.toString().equals(gx.toString())){
                    return true;
                }
                char rp = sx.charAt(0);
                sx.deleteCharAt(0);
                sx.append(rp);
                
                
            
            
            }
           
    return false;
        
    }
}