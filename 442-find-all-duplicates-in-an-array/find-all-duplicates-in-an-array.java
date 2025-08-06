import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> count = new ArrayList<>();
        Arrays.sort(nums);
        for ( int i =  1 ; i < nums.length; i++){
           
        if( nums[i]==nums[i-1]){
           if (count.isEmpty() || count.get(count.size() - 1) != nums[i]) {
                    count.add(nums[i]);
                }
        }
        }
        return count ;
    }
}