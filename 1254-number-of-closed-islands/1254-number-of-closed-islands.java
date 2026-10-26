class Solution {
    public int closedIsland(int[][] grid) {
      int ans =0;
      for(int i =1;i<grid.length;i++){
        for(int j =1;j<grid[0].length;j++){
            if(grid[i][j]==0){
                if(isClosed(grid,i,j))ans++;
            }
        }
        
      }
       return ans;
    }
    private boolean isClosed(int[][] grid,int r ,int c){       
        if(r<0|| r>=grid.length|| c <0 || c>=grid[0].length)return false;
        if(grid[r][c]==1|| grid[r][c]==-1)return true;
        grid[r][c]=-1;
        boolean down= isClosed(grid,r+1,c) ;
        boolean up =  isClosed(grid,r-1,c) ;
        boolean left =  isClosed(grid,r,c-1);
        boolean right =  isClosed(grid,r,c+1);
        return down && up && left && right;
    }
}