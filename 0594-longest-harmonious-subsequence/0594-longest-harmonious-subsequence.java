class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans =0;
        for(int n:nums){            
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.containsKey(n-1))ans =Math.max(ans, map.get(n)+map.get(n-1));
            if(map.containsKey(n+1))ans =Math.max( ans,map.get(n)+map.get(n+1));
        }
        return ans;
    }
}