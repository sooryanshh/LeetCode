class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a)!= map.get(b) ? map.get(a)-map.get(b) : b-a);
        for(int n: map.keySet()){
            pq.add(n);
        }
        int i =0;
        while(!pq.isEmpty()){
            int num = pq.poll();
            int n = map.get(num);
            while(n>0){
                nums[i++]=num;
                n--;
            }
        }
        return nums;
    }
}