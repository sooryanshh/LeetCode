class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);        
        return Math.max(helper(nums,n-1,dp),helper(nums,n-2,dp));
    }
    private int helper(int[] nums,int n ,int[] dp){
        if(n<0)return 0;        
        if(dp[n]!=-1)return dp[n];
        dp[n]= Math.max(nums[n]+helper(nums,n-2,dp),helper(nums,n-1,dp));
        return dp[n];
    }
}