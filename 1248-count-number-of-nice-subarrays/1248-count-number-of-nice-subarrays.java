class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Queue<Integer> q = new ArrayDeque<>();
        int l =0;
        int ans =0,count =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2!=0){
                count++;
                q.add(i);
            }
           
            if(count>k){
                l = q.poll()+1;
                count--;
            }
            if(count ==k){
                
                ans+=q.peek()-l+1;
            }
        }
        return ans;
    }
}