class Solution {
    public boolean isPalindrome(int x) {
      int palin = reverse(x);
       return palin == x  ? true : false ;
    }
    public int reverse(int n){
             int temp = 0 , res ;
      while(n != 0 && n>0){ 
        res = n % 10 ;
        if ( res > (Integer.MAX_VALUE/10) || res < (Integer.MIN_VALUE/10)){
            return 0 ;
        }
        temp = temp * 10 + res;
        n = n/ 10 ;
      }
      return temp ;
    }
}