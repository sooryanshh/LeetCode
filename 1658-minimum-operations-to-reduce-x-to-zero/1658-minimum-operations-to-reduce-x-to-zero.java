class Solution {
    public int minOperations(int[] nums, int x) {
        int sum =0;
        for(int n: nums){
            sum+=n;
        }
        int target = sum-x;       
        int l =0;
        sum =0;
        int ans= -1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];            
            while(l<=i &&sum>target){
                sum-=nums[l++];
            }
            if(sum==target)ans=Math.max(ans,i-l+1);
        }
        return ans==-1? -1 :nums.length-ans;
    }
}