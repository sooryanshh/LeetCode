class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
    int helper(int[] nums, int target, int sum , int i){
        if(i == nums.length && sum == target){
            return 1 ;
        }
        if(i==nums.length)return 0;
        int left = helper(nums,target,sum+nums[i],i+1);
        int right = helper(nums,target,sum-nums[i],i+1);
        return left+right;
    }
}