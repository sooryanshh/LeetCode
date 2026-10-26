class Solution {
    public int countIslands(int[][] grid, int k) {
        int ans =0;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                   if(sum(grid,i,j)%k==0)ans++;
                                  
                }
            }
        }
        
        return ans;
    }
    private long sum(int[][]grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length||c>=grid[0].length || grid[r][c]==0)return 0;
        long sum =0;
       int temp =grid[r][c];
        grid[r][c]=0;
        sum += temp+sum(grid,r+1,c)+sum(grid,r-1,c)+sum(grid,r,c+1)+sum(grid,r,c-1);
        return sum;
        
    }
}