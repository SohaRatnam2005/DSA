class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        while(k > 0 ){

            Map.Entry<Integer, Integer> maxEntry = Collections.max(
            map.entrySet(), 
            Map.Entry.comparingByValue()
             );
            int mostFrequentNum = maxEntry.getKey();

            k--;
            ans[k] = mostFrequentNum;
            map.remove(mostFrequentNum);
        }
        return ans ;

    }
}