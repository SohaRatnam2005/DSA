class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> stack = new Stack<>();
        for ( int i = 0 ; i <=str.length-1 ;i++){
          if(str[i].equals(".") || str[i].equals("")) continue;
          if(str[i].equals("..")){
            if(!stack.isEmpty()){
                stack.pop();
            }
          }
            else{
                stack.push(str[i]);
            }
          
        }

        StringBuilder sb = new StringBuilder();

            for( String x : stack){
                sb.append("/").append(x);
            }

            return sb.length()>0? sb.toString() : "/"; 


    }
}