class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // mai concept for this type of question 
        // k Different subarray = atmost k - atmost k-1;
        return count(nums,k)-count(nums,k-1);
        
    }
    private int count(int[] nums,int k ){
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans =0;
        int l =0;
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)map.remove(nums[l]);
                l++;
            }
            ans+=i-l+1;
         }
        return ans;
    }
}