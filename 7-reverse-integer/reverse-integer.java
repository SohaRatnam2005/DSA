class Solution {
    public int reverse(int n) {
           int temp = 0 , res ;
      while(n != 0 ){ 
        res = n % 10 ;
        if ( temp > (Integer.MAX_VALUE/10) || temp < (Integer.MIN_VALUE/10)){
            return 0 ;
        }
        temp = temp * 10 + res;
        n = n/ 10 ;
      }
      return temp ;
    }
}