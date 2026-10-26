class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int t1 = text1.length();
        int t2 = text2.length();
        int[][] dp = new int[t1][t2];
        for(int i =0;i<t1;i++){
            Arrays.fill(dp[i],-1);
        }
        return maxLen(text1,text2,t1-1,t2-1,dp);
    }
    private int maxLen(String s,String r,int i ,int j,int[][] dp){
        if(i <0||j<0)return 0;
       int len = 0;
        char chs = s.charAt(i);
        char chr = r.charAt(j);
        if(dp[i][j]!=-1)return dp[i][j];
        if(chs==chr){
           len = 1+maxLen(s,r,i-1,j-1,dp);
        }else {
            len = Math.max(maxLen(s,r,i-1,j,dp),maxLen(s,r,i,j-1,dp));
        }
        return dp[i][j]=len;
    }
}