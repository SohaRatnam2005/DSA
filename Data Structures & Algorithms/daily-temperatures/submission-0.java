class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
      Deque<Integer> stack = new ArrayDeque<>();
      for(  int i = 0 ; i < temperatures.length ; i++ ){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int old_day = stack.pop();
                ans[old_day] = i - old_day ;

            }
            stack.push(i);

      }
      return ans;
    }
}
