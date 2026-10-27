class Solution {
    public int minInsertions(String s) {
        StringBuilder a = new StringBuilder(s);
        StringBuilder b = new StringBuilder(s).reverse();
        int n = a.length();
        int[][] dp = new int[n][n];
        for(int i =0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return n-lcs(a,b,0,0,dp);
    }
    private int lcs(StringBuilder a,StringBuilder b ,int i,int j,int[][]dp ){
        if(i==a.length() ||j==a.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(a.charAt(i)==b.charAt(j))return dp[i][j]= 1+ lcs(a,b,i+1,j+1,dp);
        else return dp[i][j]= Math.max(lcs(a,b,i+1,j,dp),lcs(a,b,i,j+1,dp));        
    }
}