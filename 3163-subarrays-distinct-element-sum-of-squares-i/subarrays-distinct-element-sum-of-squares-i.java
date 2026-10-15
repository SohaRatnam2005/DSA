class Solution {
    public int sumCounts(List<Integer> nums) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < nums.size() ; i++){
            for(int j = i+1 ; j < nums.size() + 1 ; j++){
                list.add(nums.subList(i , j));
            }
        }
        int sum = 0 ;
        for(int i = 0 ; i < list.size(); i++){
           Set<Integer> set = new HashSet<>(list.get(i));
            int a = set.size();
            sum += a * a;
        }
        return sum ;
    }
}