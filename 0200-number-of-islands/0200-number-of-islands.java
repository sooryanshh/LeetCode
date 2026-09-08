class Solution {
    public int numIslands(char[][] grid) {
        // bfs approach for this problem 
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    bfs(grid,i,j);
                    count++;
                }
            }
        }
       return count; 
    }
    private void bfs(char[][] grid , int r , int c){
        int[] idx = {r,c};
        Queue<int[]> q = new ArrayDeque<>();
        q.add(idx);
        grid[r][c]='0';
        while(!q.isEmpty()){
            int[] front = q.poll();
            int row = front[0];
            int col = front[1];
            //up
            if(row-1>=0 &&grid[row-1][col]=='1'){
                q.add(new int[]{row-1,col});
                grid[row-1][col]='0';
            }
            // down
             if(row+1<grid.length &&grid[row+1][col]=='1'){
                q.add(new int[]{row+1,col});
                grid[row+1][col]='0';
            }

             if(col+1<grid[0].length &&grid[row][col+1]=='1'){
                q.add(new int[]{row,col+1});
                grid[row][col+1]='0';
            }
             if(col-1>=0 &&grid[row][col-1]=='1'){
                q.add(new int[]{row,col-1});
                grid[row][col-1]='0';
            }

        }
    }
}