import java.util.Arrays;

class Solution {
    public boolean exists(char[][] board , char[] word_array , int i , int j ,int indx ){
         if (indx == word_array.length) return true;
        if ( i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false ;
       if (board[i][j] == '$' || board[i][j] != word_array[indx]) return false;

       
                char ch = board[i][j];
                board[i][j]= '$';
    boolean res =    exists( board , word_array , i+1 , j , indx+1)||
                    exists( board , word_array , i-1 , j , indx+1)||
                    exists( board , word_array , i , j+1 , indx+1)||
                    exists( board , word_array , i , j-1 , indx+1);
                    board[i][j]= ch;
        return res ;



        
    }

    public boolean exist(char[][] board, String word) {
        char[] word_array = word.toCharArray();
        for ( int i = 0 ; i < board.length ; i++){
            for ( int j = 0 ; j < board[0].length ; j++){
               if ( board[i][j]==word_array[0]&&
                exists(board , word_array , i , j , 0)){
                    return true;
               }
            }

        }
        return false ;
    }
}