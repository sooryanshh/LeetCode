class Solution {
    public int uniquePathsIII(int[][] grid) {
        int  count = 0;
        int r =0, c = 0;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    r = i;
                    c =j;
                }
                if(grid[i][j]!=-1)count++;
            }
        }
        return countPath(grid,r,c,count);
    }
    int countPath(int[][]grid, int r,int c,int count){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length ||grid[r][c]==-1)return 0;
         if(grid[r][c]==2){
            if(count==1)return 1;
            else return 0;
         }
         int temp = grid[r][c];
        grid[r][c]=-1;
        int left = countPath(grid,r,c-1,count-1);
        int right = countPath(grid,r,c+1,count-1);
        int down = countPath(grid,r+1,c,count-1);
        int up = countPath(grid,r-1,c,count-1);
        grid[r][c]=temp;
        return left+right+down+up;
    }
}