class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int n= min(coins,amount,dp);
        return n>=100000?-1:n;
    }
    private int min(int coins[],int amt,int[] dp){
        if(amt==0)return 0;
        if(amt<0)return 100000;
        if(dp[amt]!=-1)return dp[amt];
        int ans =100000;
        for(int n:coins){
            ans = Math.min(ans,1+min(coins,amt-n,dp));
        }
        return dp[amt]= ans;
    }
}