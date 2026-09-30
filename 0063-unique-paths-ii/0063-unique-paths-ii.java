class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m =obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return countPath(obstacleGrid,new int[m][n],0,0);
    }
    private int countPath(int[][] grid ,int[][]dp,int r,int c){
        if(r==grid.length-1 && c==grid[0].length)return 1;
        if(r>=grid.length|| c>=grid[0].length)return 0;
        if(grid[r][c]==1)return 0;
        if(dp[r][c]!=0)return dp[r][c];
        int left =countPath(grid,dp,r,c+1);
        int down =countPath(grid,dp,r+1,c);
        return dp[r][c]=left+down;

    }
}