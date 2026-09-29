class Solution {
    public int rob(int[] nums) {
        // tabulation dp 
        if(nums.length ==1)return nums[0];
        int first = nums[0];
        int second = nums[1];
        int ans =0;
        for(int i =2;i<nums.length;i++){
            ans = Math.max(nums[i]+first,second);
            first = Math.max(first,second);
            second = ans;
        }
        return Math.max(first,second);
    }
}