class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min_capacity = 1 ;
        int max_capacity = 0 ;
        for( int weight : weights){
            max_capacity += weight ;
            min_capacity = Math.max(min_capacity , weight);
        }
        while(min_capacity <= max_capacity ){
            int mid = min_capacity + (max_capacity - min_capacity )/ 2;
            int day  = 1 ;
            int capacity = 0 ;
            for(int weight : weights){
                if( capacity + weight > mid){
                    day++;
                    capacity = weight;
                }
                else{
                    capacity += weight;
                }
            }
            if(day > days){
                min_capacity = mid + 1;
            }
            else{
                max_capacity = mid - 1;
            }
        }
        return min_capacity ;
    }
}