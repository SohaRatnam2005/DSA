class Solution {
    public int largestRectangleArea(int[] heights) {
       int[] ps = prev(heights);
       int[] ns = next(heights);
        int max_area = 0 ;
       for( int i = 0 ; i < heights.length ;i++){
         int current_area =  (ns[i] - ps[i] - 1) * heights[i];
          max_area = Math.max(current_area , max_area);
       }
       return max_area ;
    }
    private int[] prev(int[] arr){
        int[] prev = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for( int i = 0 ; i < arr.length ; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                prev[i] = -1 ;
            }
            else{
                prev[i] = stack.peek();
            }
            stack.push(i);
        }
        return prev ;
    }
    private int[] next(int[] arr){
        int[] next = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for( int i = arr.length-1 ; i >= 0  ; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i] = arr.length ;
            }
            else{
                next[i] = stack.peek();
            }
            stack.push(i);
        }
        return next ;
    }
}
