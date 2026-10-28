class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ans =0;
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];            
            int rem= sum%k;
            if(rem<0)rem=rem+k; // this is the most improtant concept to remember 
            // if(rem!=0 && nums[i]%k==0)ans++;
            if(map.containsKey(rem))ans +=map.get(rem);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}