class Solution {
    public int minCost(int[][] grid) {
        int n =grid.length,m = grid[0].length,p=1024;
        int[][][] dp =new int[n][m][p];
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++)Arrays.fill(dp[i][j],-1);
        }
        return min(grid,0,0,0,dp);
    }
    int min(int[][] grid , int r , int c,int res,int[][][] dp){
        
        if(r>=grid.length || c>=grid[0].length)return Integer.MAX_VALUE;
        res = res^grid[r][c];
        if(dp[r][c][res]!=-1)return dp[r][c][res];
        
        if(r==grid.length-1 && c==grid[0].length-1)return res;
        int down = min(grid,r+1,c,res,dp);
        int right =  min(grid,r,c+1,res,dp);
        return dp[r][c][res]= Math.min(right,down);
    }
}