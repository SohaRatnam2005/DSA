class Solution {
    public boolean checkInclusion(String s1, String s2) {
      if( s1.length() > s2.length()){
        return false ;
      }
      int[] freq = new int[26];
      int[] window = new int[26];

      for(char ch : s1.toCharArray()){
        freq[ch - 'a']++;
      }
        int len = s1.length();

      for( int i = 0 ; i < len ; i++){
        freq[s2.charAt(i) - 'a']++;
      }
      if( Arrays.equals(freq,window)){
        return true ;
      }

      for( int right = len ; right < s2.length() ; right++){
        window[s2.charAt(right) - 'a']++;

        int left = right - len ;
        window[s2.charAt(left) - 'a']--;//window[2] = window[2] - 1 ;
        if( Arrays.equals(freq , window)){
            return true ;
        }
      }
      return false ;
    }

}