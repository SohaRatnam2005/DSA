class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       
       double res[][] = new double[position.length][2];

       for( int i = 0 ; i <position.length ; i++){

        res[i][0] = position[i];
        res[i][1] = (target - position[i]) / (double) speed[i];

       }

       Arrays.sort(res , (a,b) -> Double.compare(b[0],a[0]));
        Stack<Double> stack = new Stack<>();

        for( int i = 0 ; i < position.length ; i++){
                double time = res[i][1];

            if( stack.isEmpty() || time > stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();

    }


    
}
