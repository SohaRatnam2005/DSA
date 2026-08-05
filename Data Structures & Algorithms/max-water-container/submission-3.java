class Solution {
    public int maxArea(int[] heights) {
       int maxarea = 0 ;
       int left = 0 ;
       int right = heights.length - 1 ;
       while( left < right){
        int high = Math.min( heights[left] , heights[right]);
        int dist = right - left ;
        maxarea = Math.max(high * dist , maxarea);
        if(heights[left]<heights[right]){
            left++;
        }
        else
            right--;
       }
       return maxarea ;
        
    }
}
