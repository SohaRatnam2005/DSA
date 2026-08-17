class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0 , right = left + k - 1 , len = nums.length - k+ 1 , index = 0 ;
        int[] ans = new int[len];
        while( right < nums.length ){
            int max = 0 ;
            for( int i = left ; i<= right ; i++ ){
                if( nums[i] > max ){
                    max = nums[i];
                }
            }
            ans[index] = max;
            index++;
            right++;
            left++;

        }
        return ans ;
    }
}
