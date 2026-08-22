class Solution {
    public String decodeString(String s) {
        Deque<String> str = new ArrayDeque<>();
        Deque<Integer> nums = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for( char ch : s.toCharArray()){
            if(ch == ']'){
                String top = str.pop();
                while(!top.equals("[")){
                sb.insert(0,top);
                top = str.pop();
                }
                int number = nums.pop();
                String res = sb.toString().repeat(number);
                sb.setLength(0);
                str.push(res);
            }
            else if(Character.isDigit(ch)){
                nums.push(ch - '0');
            }
            else{
               str.push(String.valueOf(ch));
            }
        }
        while(!str.isEmpty()){
            sb.insert(0,str.pop());
        }
    return sb.toString();
    }
    
}