class Solution {
    public boolean canPartition(int[] nums) {
        int target = 0;
        for(int n :nums)target+=n;
        if(target%2!=0)return false;
        Boolean[][] dp = new Boolean[nums.length][target+1];
        return check(nums,0,dp,target,0);
    }
    private boolean check(int[] nums,int i,Boolean[][] dp,int target,int sum){
        if(sum==target/2)return true;
        if(i>=nums.length)return false;
        if(sum>target/2)return false;
        if(dp[i][sum]!=null)return dp[i][sum];
        return dp[i][sum]=check(nums,i+1,dp,target,sum+nums[i]) || check(nums,i+1,dp,target,sum);
    }
}