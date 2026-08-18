class Solution {
    public int calPoints(String[] operations) {
       Deque<Integer> stack = new ArrayDeque<>();
       for( int i = 0 ; i < operations.length ; i++){
       if (!operations[i].equals("+") && !operations[i].equals("D") && !operations[i].equals("C") ){
        stack.push(Integer.parseInt(operations[i]));
       }
       else if(operations[i].equals("+")){
        int first =stack.pop();
        int second = stack.peek();
            stack.push(first);
            stack.push(first + second);
       }
       else if ( operations[i].equals("D")){
        stack.push(2 * stack.peek());
       }
       else{
        stack.pop();
       }
       }
       int sum = 0 ;
       while( !stack.isEmpty()){
        sum += stack.pop();
       }

       return sum ;
         
    }
}