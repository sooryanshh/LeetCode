class Solution {
    public int climbStairs(int n) {
        // solving this problem with top down approach with memo 
        int[] dp = new int[n+1];
        return fun(n,dp);
    }
    private int fun(int n ,int[] dp){
        if(n==1 || n==2)return n;
        if(dp[n]!=0)return dp[n];
        int ans= fun(n-1,dp)+fun(n-2,dp);
        return dp[n]=ans;
    }
}