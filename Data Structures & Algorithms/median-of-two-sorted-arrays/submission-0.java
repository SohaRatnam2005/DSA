class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length , n = nums2.length  ;
        int[] res = mergeinPlace(nums1,m,nums2,n);
        double median = 0;
        int len = res.length ;
        if(len %2 == 0){
            median = (res[len / 2 - 1] + res[(len/2)])/2.0 ;
        }
        else{
            median = res[(len)/2];
        }

    return median ;


    }
    private int[] mergeinPlace(int[] nums , int n , int[] arr , int m){
        int i =0 ;
        int j =0;
        int k = 0 ;
        int[] result = new int[m+n];
        while(i < n && j < m ){
            if(nums[i] < arr[j]){
                result[k++] = nums[i++];
            }
            else{
                result[k++] = arr[j++];
            }
        }
        while(i < n){
            result[k++] = nums[i++];
        }
        while(j < m){
            result[k++] = arr[j++];
        }
        return result;
    }
}
