class Solution {
    public int getMaximumGold(int[][] grid) {
        int ans =0;
        for(int i =0;i<grid.length;i++){
            
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                  int gold = countGold(grid,i,j,0);
                   ans = Math.max(ans,gold);
                }
               
            }
        }
        return ans;
    }
    int countGold(int[][] grid , int r , int c,int sum){
        if(r<0|| r>=grid.length|| c<0|| c>=grid[0].length || grid[r][c]==0) return sum;
        int temp = grid[r][c];
        grid[r][c]=0;
        int up =  countGold(grid,r-1,c,sum+temp);
        int down = countGold(grid,r+1,c,sum+temp);
        int right =countGold(grid,r,c+1,sum+temp);
        int left = countGold(grid,r,c-1,sum+temp);
        grid[r][c]=temp;
        return Math.max(Math.max(left,right),Math.max(up,down)) ;
    }
}