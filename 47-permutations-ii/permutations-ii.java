class Solution {
    private void backtrack (List<List<Integer>>res ,  ArrayList<Integer> TempList , int[]nums , boolean[] used){

        if(TempList.size()==nums.length 
        ){
            res.add(new ArrayList<>(TempList));
            return ;
        }

        for ( int i = 0 ; i <= nums.length - 1 ; i++){
            if(used[i]){
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            used[i]= true ;
            TempList.add(nums[i]);

            backtrack(res , TempList , nums , used);

            used[i]=false;
            TempList.remove(TempList.size()-1);
            
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res , new ArrayList<>() , nums , new boolean[nums.length]);
        return res ;
    }
}