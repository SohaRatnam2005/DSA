class Solution {
    public String minWindow(String s, String t) {
        int[] mapS = new int[128];
        int[] mapT = new int[128];

        for( char ch : t.toCharArray()) mapT[ch]++;

        int left = 0 , right = 0 , min_len = Integer.MAX_VALUE , start = 0 ;
        for(; right < s.length() ; right++ ){
            mapS[s.charAt(right)]++;

            while( contains(mapS , mapT)){
                if( right - left + 1 < min_len){
                    min_len = right - left + 1 ;
                    start = left ;
                }
                mapS[s.charAt(left++)]--;
            }
        }

    return min_len == Integer.MAX_VALUE ? "" : s.substring(start, min_len+start );
    }

   private boolean contains( int[] mapS , int[] mapT){
        for( int i = 0 ; i < mapT.length ; i++){
            if( mapT[i] > mapS[i] ){
                return false ;
            }
        }
        return true ;
    }
}