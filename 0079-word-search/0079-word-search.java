class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i =0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0) &&check(board,word,i,j,0))return true;
            }
        }
        return false;
    }
    boolean check(char[][] board , String word,int r , int c ,int i){
        if(i==word.length())return true;
        if(r<0||c<0||r>=board.length || c>=board[0].length ||word.charAt(i)!=board[r][c] || board[r][c]=='#')return false;
        char temp = board[r][c];
        board[r][c]= '#';
        boolean down= check(board,word,r+1,c,i+1);
        boolean up= check(board,word,r-1,c,i+1);
        boolean left=  check(board,word,r,c-1,i+1);
        boolean right= check(board,word,r,c+1,i+1);
        board[r][c]= temp;
        return up|| down|| left|| right;
        
        
    }
}