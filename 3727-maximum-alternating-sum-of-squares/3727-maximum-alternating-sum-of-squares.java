class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        // Arrays.sort(nums);
        long sum =0;
        for(int i = 0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        for(int i= 0;i<nums.length;i++){
            if(i<n/2)sum-=nums[i];
            else sum+=nums[i];
        }
        return sum;
    }
}