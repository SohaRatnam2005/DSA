class Solution {
    private int Minvalue(int[] nums){
        Arrays.sort(nums);
        int n = (nums.length-1 )/2 ;
        int median = nums[n];
        int min_sum = 0 ;
        int i = 0 ;
        while(i<nums.length){
            min_sum += Math.abs(nums[i]-median);
            i++;
        }
        return min_sum;

    }
    public int minMoves2(int[] nums) {
        return Minvalue(nums);
    }
}