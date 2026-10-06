class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int i =0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        n= minCoins(coins,amount,n-1,dp);
        return n>=100000 ? -1:n;

    }
    private int minCoins(int[] coins,int amt,int i,int[][] dp){
        if(i<0)return 100000;        
        if(amt ==0)return 0;
        if(amt<0)return 100000;
        if(dp[i][amt]!=-1)return dp[i][amt];
        int pick = 1+minCoins(coins,amt-coins[i],i,dp);
        int skip = minCoins(coins,amt,i-1,dp);
        // return Math.min(pick,skip);
        return dp[i][amt]=Math.min(pick,skip);
    }
}