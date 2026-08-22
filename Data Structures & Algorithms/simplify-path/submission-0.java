class Solution {
    public String simplifyPath(String path) {
        String[] res = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for( String s : res){
            if(s.equals("." ) || s.equals("")){
                continue;
            }
            else if(s.equals("..") && (!stack.isEmpty())){
                stack.pop();
            }
            else if(s.equals("..") && (stack.isEmpty())){
                continue;
            }
            else{
                stack.push(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            String last = stack.pollLast();
            sb.append("/");
            sb.append(last);
        }
        
        
        return sb.length() == 0 ? "/" : sb.toString();
    }
}