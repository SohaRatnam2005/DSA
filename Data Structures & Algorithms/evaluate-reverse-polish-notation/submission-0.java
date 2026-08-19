class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack =new ArrayDeque<>();
        int ans = 0 ;
        for(String s : tokens){
            if( s.equals("+")){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(first + second);
            }
            else if ( s.equals("-")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            }
            else if (s.equals("*")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first * second);
            }
            else if (s.equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
