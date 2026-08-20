class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for( int num : asteroids){
            while(!stack.isEmpty() && num < 0 && stack.peekLast() > 0){
                int diff = num + stack.peekLast();
                if(diff < 0){
                    stack.pollLast();
                }
                else if ( diff == 0){
                    num = 0 ;
                    stack.pollLast();
                }
                else{
                    num = 0 ;
                }
            }
            if( num != 0) stack.add(num);
            
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}