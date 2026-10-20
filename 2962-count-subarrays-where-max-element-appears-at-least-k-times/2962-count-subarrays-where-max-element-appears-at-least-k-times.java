class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans =0;
        int max = nums[0];
        int count =0;
        for(int n:nums){
            if(n>max)max=n;
        }
        Queue<Integer> q = new ArrayDeque<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]==max)q.add(i);
            if(q.size()>k)q.poll();
            if(q.size()==k)ans+=q.peek()+1;
            
            }
        return ans;

    }
}