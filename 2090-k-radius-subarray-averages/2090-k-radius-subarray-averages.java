class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        int j =k;
        int l =0;
        long sum=0;
        for(int i =0;i<nums.length;i++){
          sum+=nums[i];
            if(i-l+1==2*k+1){
                ans[j++]=(int)((sum)/(2*k+1));
                sum-=nums[l++];
                }         
        }
        return ans;
        }
       
    }
