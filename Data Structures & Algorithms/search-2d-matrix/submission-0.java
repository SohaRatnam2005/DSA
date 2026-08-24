class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int right = matrix.length - 1 ;
        int n = matrix[0].length ;
        int row = 0 ;
        int left = 0 ;
    
    for(int i = 0 ; i < matrix.length ; i++){
        if( matrix[i][0] <= target){
            row = i ;
        }
    }
    while(left <= right){
        int mid = left + (right - left)/2;
        if(matrix[row][mid] == target){
            return true ;
        }
        else if( matrix[row][mid] > target){
            right = mid - 1 ;
        }
        else{
            left = mid + 1 ;
        }
    }
    return false ;
    }
}
