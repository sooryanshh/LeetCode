class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // solving this problem with top down appraoch with memo 
        int[] dp  = new int[cost.length];
        Arrays.fill(dp,-1);
        dp[0]=cost[0];
        dp[1]=cost[1];
        helper(cost,dp,cost.length-1);
        System.out.println(Arrays.toString(dp));
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }
    private int helper(int[] cost , int[] dp,int i){        
        if(i==1)return cost[1];
        if(i==0)return cost[0];
        if(dp[i]!=-1)return dp[i];
        int ans = cost[i]+Math.min(helper(cost,dp,i-1),helper(cost,dp,i-2));
        return dp[i]=ans;
    }
}