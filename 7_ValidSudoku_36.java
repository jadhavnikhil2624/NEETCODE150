import java.util.*;
class Solution {

    public boolean isValidSudoku(char[][] board) {
        Set<String> s = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    if(!s.add("row"+i+board[i][j]) || !s.add("column"+j+board[i][j]) || ! s.add("box"+(i/3)*3+j/3+board[i][j])){
                        return false;
                    }
                }//End if
            }//End for j
        }//End for i
        return true;
    }//End isValidSudoku
}//End Solution