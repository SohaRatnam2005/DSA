/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        if(binarySearchIncrreasing( mountainArr, target ,0 ,peak) != - 1){
            return binarySearchIncrreasing( mountainArr, target ,0 ,peak ) ;
        }
        return binarySearchDecreasing(mountainArr ,target ,peak , mountainArr.length());

    }
    private int findPeak(MountainArray arr){
        int l = 0 ;
        int r = arr.length() - 1;
        while(l < r){
            int mid = l + (r - l)/2 ;
            if(arr.get(mid) < arr.get(mid+1)){
                l = mid + 1 ;
            }else{
                r = mid ;
            }
        }
        return l ;
    }
    private int binarySearchIncrreasing(MountainArray arr , int target , int start , int end ){
        int left = start ;
        int right = end-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr.get(mid) == target){
                return mid ;
            }
            else if (arr.get(mid) < target ){
                left = mid + 1 ;
            }
            else{
                right = mid - 1 ;
            }
        }
        return -1 ;
    }
    private int binarySearchDecreasing(MountainArray arr , int target , int start , int end){
        int left = start ;
        int right = end - 1 ;
        while(left <= right){
            int mid = left + (right - left )/2 ;
            if(arr.get(mid) == target){
                return mid;
            }
            else if( arr.get(mid)<target){
                right = mid - 1;
            }
            else{
                left = mid + 1 ;
            }
        }
        return -1 ;
    }
}