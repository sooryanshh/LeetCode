class Solution {
    public int minFallingPathSum(int[][] matrix) {
       int n = matrix.length;
       int m = matrix[0].length;
       int[][] dp = new int[m][n];
       for(int i =0;i<n;i++){
        for(int j =0;j<m;j++)dp[i][j]=101;
       } 
        int min =Integer.MAX_VALUE;
         for(int i =0;i<m;i++){
            int K =getMin(matrix,dp,0,i);
            min =Math.min(min,K);
         }
        return min;
    }
    private int getMin(int[][] matrix,int[][] dp,int r,int c){
        if(c<0 || c>=matrix[0].length || r>=matrix.length)return 100000;
        if(r==matrix.length-1)return matrix[r][c];
        if(dp[r][c]!=101)return dp[r][c];
    //    for(int i =0;i<matrix.length;i++){
        int left =getMin(matrix,dp,r+1,c-1);
        int right =getMin(matrix,dp,r+1,c);
        int down = getMin(matrix,dp,r+1,c+1);        
         int ans  = matrix[r][c] +Math.min(left,Math.min(right,down));
        return dp[r][c]=ans;
    //    }
    }
}