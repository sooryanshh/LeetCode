class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int count = area(grid,i,j);
                    ans = Math.max(count,ans);
                }
            }
        }
        return ans;
    }
    int area(int[][] grid , int r, int c){
        if(r<0 || r>= grid.length || c<0 || c>=grid[0].length || grid[r][c]==0)return 0;
        grid[r][c]=0;
        int a = area(grid,r+1,c);
        int b = area(grid,r-1,c );
        int e =area(grid,r,c-1) ;
        int d = area(grid,r,c+1);
        
        return 1+a+b+e+d;
    }
}