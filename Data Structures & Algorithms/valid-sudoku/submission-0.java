class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> map = new HashSet<>();

        for(int i = 0 ; i < 9 ;i++){
            for(int j = 0 ; j < 9 ; j++){
                int num = board[i][j];
                if( num != '.'){//it mean the index is filled
                    if((!map.add( num + "at row" + i)) ||(!map.add( num + "at col" + j))|| (!map.add( num + " in section " + i/3 + "-" + j/3))){
                                    return false ;
                    }
                }
            }
        }
     return true ;
    }
}
