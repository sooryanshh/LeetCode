class Solution {
    // int ans =0;
    public int change(int amount, int[] coins) {
        int n = coins.length;
       int[][] dp = new int[n][amount+1];
       for(int i =0;i<n;i++){
        Arrays.fill(dp[i],-1);
       } 
       return count(amount,coins,0,dp);
      
    }
    private int count(int amt, int[] coins,int i,int[][] dp){
        if(amt==0)return 1;
        if(amt <0)return 0;
        if(i>=coins.length)return 0;
        if(dp[i][amt]!=-1)return dp[i][amt];
        int pick =count(amt-coins[i],coins,i,dp);
        int skip = count(amt,coins,i+1,dp);
        return dp[i][amt]=pick +skip;
    }
}