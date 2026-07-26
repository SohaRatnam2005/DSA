class Solution {
    public int[] productExceptSelf(int[] nums) {
       
       int[] res = new int[nums.length];
       
       for( int i = 0 ; i < nums.length ; i++){
        int right = nums.length - 1  ;
        int left = 0;
        int left_prod = 1 ;
        int right_prod = 1 ;
        int curr = nums[i];
        while(left < i ){
            left_prod *= nums[left];
            left++;
        }
        while( right> i ){
            right_prod*= nums[right];
            right--;
        }
        int product = left_prod * right_prod;
        res[i] = product;
       }
       return res ;
        
    }
}  
