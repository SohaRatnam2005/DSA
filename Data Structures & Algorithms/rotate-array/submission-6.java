class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length - 1 ;
          k = k % nums.length;
        if( k == 0 ) return ;
       
        
        Swap( nums , 0 , n );
        Swap( nums , 0 , k-1);
        Swap( nums , k , n );
       
        


    }
    private void Swap( int[] nums , int left , int right ){
        while( left < right){
        int temp  = nums[left];
        nums[left] = nums[right];
        nums[right] = temp ;
        left++;
        right--;
        }
    }
}