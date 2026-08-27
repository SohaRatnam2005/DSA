class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length - 1 ;
        while( left <= right){
            int mid = left +(right - left)/2 ;
            if(nums[mid] == target){
                return true ;
            }
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
        left++;
        right--;
    }
            else if(nums[mid] < nums[right]){// right side is sorted
                if( target <= nums[right] && target > nums[mid]){
                    left = mid+1;
                }
                else{
                    right = mid - 1;
                }
            }
            else{// left side is sorted 
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1 ;
                }

            }
            
        }
        return false ;

        // Map<Integer , Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num , map.getOrDefault(num , 0)+1);
        // }
        // if(map.containsKey(target)){
        //     return true ;
        // }
        // return false ;
    }
}