class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int ans =0;
        map.put(0,-1);
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0)nums[i]=-1;
            sum+=nums[i];
            if(map.containsKey(sum))ans=Math.max(ans,i-map.get(sum));
            if(!map.containsKey(sum))map.put(sum,i);
        }
        return ans;
    }
}