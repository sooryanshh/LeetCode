class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans=0;
        int l =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>=minK && nums[i]<=maxK){
                ans+=i-l+1;
            }
            else l =i+1;
        }
        return ans;
    }
}