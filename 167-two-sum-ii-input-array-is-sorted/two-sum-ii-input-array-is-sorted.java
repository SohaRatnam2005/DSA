class Solution {
    public int[] twoSum(int[] numbers, int target) {
       Map<Integer,Integer> map = new HashMap<>();
       int ans = 0 , index = 0 ;
       for(int i = 0 ; i < numbers.length ; i++){
        int diff = target - numbers[i];
            if(map.containsKey(diff)){
                index = i ;
                ans =  map.get(diff);
                break;
            }
        map.put(numbers[i],i);
       }
       return new int[]{ans + 1, index + 1 } ;
    }
}