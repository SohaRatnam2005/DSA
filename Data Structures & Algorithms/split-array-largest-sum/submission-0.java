class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0 ;
        int right = 0 ;
        for(int num : nums )
        {
            left = Math.max(left , num );// max because the range can  only be between the max number and the sum of all 
            right += num ;// max limit 
            }

            while(left < right){
                int mid = left + (right - left )/2 ;

                if(canSplit(nums ,k,mid)){
                    right = mid ;// mid is possible
                // Trying to find an even smaller answer
                }
                else{
                    left = mid + 1 ;// mid is not possible
                // We need a larger limit
                }
            }
        
            return left ;
        }
    }
    private boolean canSplit(int[] nums , int k , int limit){
        int curr = 0 ;
        int subarrays = 1 ;
        for(int num : nums){
            if(curr + num > limit){
                subarrays++;
                curr = num ;
                if(subarrays > k){
                    return false ;
                }
            }
            else {
                curr += num ;
               }
        }
        return true ;
    }
