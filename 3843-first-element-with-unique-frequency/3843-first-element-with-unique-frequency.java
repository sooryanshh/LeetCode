class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>(); 
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            }
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n: map.keySet()){
            mp.put(map.get(n),mp.getOrDefault(map.get(n),0)+1);
        }
        for(int n: nums){
            int freq = map.get(n);
            int f = mp.get(freq);
            if(f==1)return n;
        }
        return -1;
              
            
    }
}