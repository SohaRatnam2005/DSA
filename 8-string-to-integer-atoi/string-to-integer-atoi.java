class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if( s.isEmpty()) return 0 ;// removing whitespaces 

        int i = 0 ;
        long num = 0 ;// so that it can hold 32 bit integer max and min value 
        int sign = 1 ;
         if( s.charAt(i)== '-' || s.charAt(i)=='+'){ // making the sign value by checkingthe sign is positive or negative 
            sign = ( s.charAt(i)=='-')?-1 : 1 ; 
            i++;
         }
       
       while ( i < s.length() && Character.isDigit(s.charAt(i)) ){
              num = num * 10 + (  s.charAt(i)-'0');// here we use ASCII value 0 = 96 ; 1 = 97 ; 2 = 98 ; 3 = 99 ; 4 = 100 ; 5 = 101 ; 6 = 102 ; 7 = 103 ; 8 = 104 ; 9 = 105 sooo if the value at i = 9 we get value 105 - 96 = 9 which will be intger not string 
              if( num * sign > Integer.MAX_VALUE){ // we use the last condition that is rounding up 
                return Integer.MAX_VALUE;
              }
              if( num * sign < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
              }
              i++;
       }
       return (int)(sign*num);
    }
}