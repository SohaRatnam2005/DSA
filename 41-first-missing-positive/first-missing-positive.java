class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        for ( int num : nums){
            if(num>0){
                hset.add(num);
            }
        }
        int res = 1 ;
        while(hset.contains(res)){
            res++;
        }
        return res ;
    }
}