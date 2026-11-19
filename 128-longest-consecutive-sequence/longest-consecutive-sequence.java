class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0 ;
        }
        int count = 1 ;
        int max_count = 1 ;
       Arrays.sort(nums);
       for(int i = 1 ; i < nums.length ; i++){
        if(nums[i]== nums[i-1]){
            continue;
        }
        if(nums[i] - nums[i-1] == 1 ){
            count++;
        }
        else{
            count = 1 ;
        }
        max_count = Math.max(max_count,count);
        
       } 
       return max_count ;
    }
}