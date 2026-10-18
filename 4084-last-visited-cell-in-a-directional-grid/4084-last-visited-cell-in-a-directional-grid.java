class Solution {
    int[] ans={0,0};
    // boolean flag = true;
    public int[] lastVisitedCell(char[][] grid) {
        helper(grid,0,0,0,0);
        return ans;
    }
    private void helper(char[][] grid,int r,int c,int lr,int lc){
        if( r>=grid.length || c>=grid[0].length || c<0 || r<0 || grid[r][c]=='X'){
            // if(flag){
            ans[0]=lr;
            ans[1]=lc;
            // flag = false;
            return ;
            }
           
        
        char ch = grid[r][c];
        grid[r][c]='X';
        if(ch=='L')helper(grid,r,c-1,r,c);
        if(ch=='R')helper(grid,r,c+1,r,c);
        if(ch=='U')helper(grid,r-1,c,r,c);
        if(ch == 'D')helper(grid,r+1,c,r,c);
    }

}