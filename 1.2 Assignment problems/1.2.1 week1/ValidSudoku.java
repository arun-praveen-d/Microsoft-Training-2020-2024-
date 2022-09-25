class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row;
        Set<Character> col;
        //checking rows
        for(int i=0;i<board.length;i++){
            row = new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.')
                    continue;
                if(row.contains(board[i][j]))
                    return false;
                
                row.add(board[i][j]);
                
            }
        }
        //checking columns
        for(int i=0;i<board[0].length;i++){
            col = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[j][i]=='.')
                    continue;
                if(col.contains(board[j][i]))
                   return false;
                
                col.add(board[j][i]);
                }
        }
        
        //checking 3x3 blocks
        
        for(int i=0;i<board.length;i+=3){
            for(int j=0;j<board[0].length;j+=3){
                if(!block(board,i,j))
                    return false;
            }
        }
        
        return true;
    }
    public boolean block(char[][] board,int r,int c){
        int row = r+3;
        int col= c+3;
      Set<Character>  block = new HashSet<>();
        for(int i=r;i<row;i++){
           
            for(int j=c;j<col;j++){
                 if(board[i][j]=='.')
                    continue;
                if(block.contains(board[i][j]))
                   return false;
                
                block.add(board[i][j]);
            }
            
        }
        return true;
    }
}
