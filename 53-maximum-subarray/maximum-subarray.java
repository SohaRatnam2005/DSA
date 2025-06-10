class Solution {
    public int maxSubArray(int[] nums) {
       int MaxSum = nums[0];
       int currentSum = nums[0];
       for ( int i = 1 ; i < nums.length ; i++){

        currentSum = Math.max( nums[i] , nums[i]+currentSum);
        MaxSum = Math.max ( MaxSum , currentSum );
       }
       return MaxSum ;
    }

}