class Solution {
    public boolean hasValidPath(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if((m+n-1)%2!=0)return false;
        Stack<Character> st = new Stack<>();
        Boolean[][][] dp = new Boolean[n][m][201];
        return isValid(grid, dp, 0, 0, 0);
    }

    private boolean isValid(char[][] grid, Boolean[][][] dp, int r, int c, int l){
        if (r >= grid.length || c >= grid[0].length)
            return false;
        char ch = grid[r][c];
        if (ch == '(')
            l++;
        else {
            if (l == 0)
                return false;
            l--;
        }
        if (r == grid.length - 1 && c == grid[0].length - 1 && l == 0)
            return true;
        if (dp[r][c][l] != null) return dp[r][c][l];
           
        boolean down = isValid(grid, dp, r + 1, c, l);
        boolean right = isValid(grid, dp, r, c + 1, l);
      
        return   dp[r][c][l]=right || down;
    }

}