class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length ;
       int  prefixMod = 0;
       int  result = 0 ;
       int[] modprefix = new int[k];
       modprefix[0] = 1 ;
       for ( int num : nums ){
        prefixMod = ( prefixMod + num % k + k)%k;
        result += modprefix[prefixMod];
        modprefix[prefixMod]++;

       }
    

    return result ;
    }
}