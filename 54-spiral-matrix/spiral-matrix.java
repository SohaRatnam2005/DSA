class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row_beg = 0 ;
        int col_beg = 0 ;
        int row_end = matrix.length - 1 ;
        int col_end = matrix[0].length-1;
        if ( matrix.length ==0 ){
            return result ;
        }
        while ( row_beg <= row_end && col_beg <= col_end){
            for( int i = col_beg ; i<= col_end ; i++ ){
                result.add(matrix[row_beg][i]);      
            }
                 row_beg++;

            for( int j = row_beg ; j<= row_end ; j++){
                    result.add(matrix[j][col_end]);

            }
            col_end--;
            if(row_beg<= row_end){
                for( int k = col_end ; k >= col_beg ; k--){
                    result.add(matrix[row_end][k]);
                }
                row_end--;
             }

            if( col_beg<= col_end){
                for ( int l = row_end ; l>= row_beg ; l--){
                    result.add(matrix[l][col_beg]);
                }
                col_beg++;
            }
           
        }
        
        return result ;  
    }
}