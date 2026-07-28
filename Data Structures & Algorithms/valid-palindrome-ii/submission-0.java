class Solution {
    public boolean validPalindrome(String s) {
        if(isPalindrome(s)){
            return true ;
        }
        int low = 0 ;
        int high = s.length() - 1 ;
        while(low < high ){
            if( s.charAt(low) != s.charAt(high)){
                return isPalindrome( s.substring(0,low) + s.substring(low+1)) || 
                        isPalindrome( s.substring(0,high) + s.substring(high+1));

            }
            low++;
            high--;
        }


        return true ;

    }

    private boolean isPalindrome( String s){
        int low = 0 ;
        int high = s.length() -1 ;

        while( low < high ){
            if(s.charAt(low) != s.charAt(high)){
                return false ;
            } 
            low++ ;
            high--;
        }
        return true ;
    }
}