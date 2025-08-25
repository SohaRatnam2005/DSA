import java.util.Arrays;

import java.util.Arrays;
class Solution {
    

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder answer = new StringBuilder();
      char[] first = strs[0].toCharArray();
      char[] last = strs[strs.length-1].toCharArray();

      for ( int i = 0 ; i < first.length ; i++){
        if( first[i]!=last[i])break;
        answer.append(first[i]);
      }
      return answer.toString();
    }
}