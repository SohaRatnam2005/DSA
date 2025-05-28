class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int drop = 0 ;
        if ( nums[0]< nums[n-1]){
            drop++;
        }
        for( int i = 0 ; i < n-1 ; i++){
            if(nums[i] > nums[i+1]){
                drop++;
            }
            if(drop>1) return false ;
        }
        return true ;
    }
}