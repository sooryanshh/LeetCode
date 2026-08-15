class Solution {
    public long countSubarrays(int[] nums, long k) {
        int l = 0;
        long sum = 0;
        long ans =0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            while(sum*(i-l+1)>=k){
               sum-=nums[l];
               l++;
            }
            ans+=i-l+1;
        }
        return ans;
    }
}