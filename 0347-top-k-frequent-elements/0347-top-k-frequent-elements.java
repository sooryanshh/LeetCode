class Solution {
    public class pair{
        int key;
        int val;
        public pair(int key,int val){
            this.key = key ;
            this.val = val;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> a.val!=b.val ? b.val-a.val : a.key-b.key);
        for(int key: map.keySet()){
            pq.add(new pair(key,map.get(key)));
        }
        int[] ans = new int[k];
        int i =0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll().key;
            if(i==k)break;
        }
        return ans;
    }
}