class Solution {
    public boolean canJump(int[] nums) {
        int final_pos = nums.length-1;
        for ( int i = nums.length-2 ; i >= 0 ;i--){
            if ( i + nums[i]>= final_pos){
                final_pos= i ;
            }
        }
        return final_pos==0 ;
    }
}