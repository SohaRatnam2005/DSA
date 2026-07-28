class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length ;
        int low = n/3;
        List<Integer> list = new ArrayList<>(); 
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int num : nums){

            map.put(num , map.getOrDefault(num,0)+1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                 if (entry.getValue() > low) {
                            list.add(entry.getKey());
    }
}
        
        return list ;
    }
}