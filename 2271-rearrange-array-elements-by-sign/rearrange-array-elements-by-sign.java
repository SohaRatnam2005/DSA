class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int positiveIndex = 0 ;
        int negativeIndex = 1 ;

        for ( int x : nums  ){
            if ( x < 0){
                arr[negativeIndex] = x ;
                negativeIndex += 2 ;
            }
            else{
               arr[positiveIndex] = x ;
               positiveIndex += 2 ;
            }

        }
        return arr;
    }
}