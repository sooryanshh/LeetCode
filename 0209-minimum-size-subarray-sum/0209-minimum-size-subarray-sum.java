class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans =Integer.MAX_VALUE;
      int l =0;
      long sum =0;
      for(int i =0;i<nums.length;i++){
        sum+=nums[i];
        while(l<=i && sum>=target){
          ans = Math.min(ans,i-l+1);
          //System.out.println(ans);
          sum-=nums[l];
          l++;
        }     
        
      }
      return ans==Integer.MAX_VALUE ?0:ans;
    }
}