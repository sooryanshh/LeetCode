class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int l =0;
        int ans = 0;
        int count = 0;
        Queue<Integer> q = new ArrayDeque<>();
        int last =-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                count++;
                if(last==-1)last =i;
                else q.add(i);
                }
            while(count>k){
                if(nums[l]%2!=0){
                    count--;
                    last =q.poll();
                    }
                l++;
            }
            if(count ==k)ans+=last-l+1;
        }
        return ans;
    }
}