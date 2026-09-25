class Solution {
    private int fibo(int n ,int[] dp){
        if(n<2)return n;
        if(dp[n]!=0)return dp[n];
        int ans =fibo(n-1,dp)+fibo(n-2,dp);
        dp[n]= ans;
        return ans;
    }
    public int fib(int n) {
       // this is dp solution for fibonacci 
        return fibo(n,new int[n+1]);
    }
}