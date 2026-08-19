class Solution {
    public boolean isValid(String s) {
      Deque<Character> stack = new ArrayDeque<>();
      for(char ch : s.toCharArray()){
        if( ch == '[' || ch == '{' || ch == '('){
            stack.push(ch);
        }
        else{
            if(stack.isEmpty()) return false ;
            char top = stack.pop();
            if( (top == '[' && ch != ']') || (top == '{' && ch != '}') || (top == '(' && ch != ')')) return false ;
        }
      }
        return stack.isEmpty();
    }
}
