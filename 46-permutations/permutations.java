class Solution {
    private void backtrack(List<List<Integer>> resultList , ArrayList<Integer> TempList , int[] nums){

            if (TempList.size() == nums.length ){
                resultList.add(new ArrayList<>(TempList));
                return ;
            }


        for(int number : nums){
            if(TempList.contains(number)){
                continue;
            }
            TempList.add(number);

            backtrack(resultList , TempList , nums);

            TempList.remove(TempList.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList , new ArrayList<>() , nums);
        return resultList ;
    }
}