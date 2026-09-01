class Solution {
    public class pair{
        String key ;
        int val;
        public pair(String key , int val){
            this.key = key;
            this.val = val;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
       HashMap<String,Integer> map = new HashMap<>();
       for(String s: words){
         map.put(s,map.getOrDefault(s,0)+1);
       } 
       PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> a.val!=b.val ? b.val - a.val : a.key.compareTo(b.key));
        for(String s : map.keySet()){
            pq.add(new pair(s,map.get(s)));
        }
        List<String> ans = new ArrayList<>();
        while(k>0){
            ans.add(pq.poll().key);
            k--;
        }
        return ans;
    }
}