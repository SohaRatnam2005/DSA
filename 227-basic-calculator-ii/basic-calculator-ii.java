class Solution {
    private int Calc(String s){
       s = s.replaceAll("\\s","");
       int num = 0 ;
       char operator ='+';

       Stack<Integer> numbstack = new Stack<>();
       for ( int index = 0 ; index < s.length() ; index++){
        char ch = s.charAt(index);
        if( Character.isDigit(ch)){
            num = (num*10 ) + ( ch - '0');//done for two digit numbers 
           
        }
        if(!Character.isDigit(ch) || index == s.length()-1){
            
            if(operator == '+'){
                numbstack.push(num);
            }
            else if(operator == '-'){
                numbstack.push(-1*num);
            }
            else if ( operator == '*'){
                numbstack.push(num * numbstack.pop());

            }
            else if( operator == '/'){
                numbstack.push(numbstack.pop() / num);
            }
            else {
                numbstack.push(numbstack.pop() % num);
            }
             operator = ch; 
             num= 0 ;
        }
       }
        int sum = 0 ;
        while ( !numbstack.isEmpty() ){
            sum += numbstack.pop();
        }
        
       
       return sum ;
    }
      

    
    public int calculate(String s) {
        return Calc(s);
    }
}