class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0 ;
        

        for(int right = 1 ; right <= nums.length -1 ; right++ ){
            if(nums[right] != nums[left]){
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1 ;
    }
}