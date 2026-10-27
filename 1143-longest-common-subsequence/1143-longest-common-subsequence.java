class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // this is top down solution for this problem ...but there is an even better solution for this using tabulation .. 
        StringBuilder a = new StringBuilder(text1);
        StringBuilder b =new StringBuilder(text2);
        int t1 =a.length();
        int t2 = b.length();
        int[][] dp = new int[t1][t2];
        for(int i =0;i<t1;i++){
            Arrays.fill(dp[i],-1);
        }
        return lcs(a,b,t1-1,t2-1,dp);
    }
    private int lcs(StringBuilder a,StringBuilder b ,int i ,int j,int[][] dp ){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(a.charAt(i)==b.charAt(j))return dp[i][j]= 1+lcs(a,b,i-1,j-1,dp);
        else return dp[i][j] = Math.max(lcs(a,b,i-1,j,dp),lcs(a,b,i,j-1,dp));
    }
}