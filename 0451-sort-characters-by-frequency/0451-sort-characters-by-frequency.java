class Solution {
    public String frequencySort(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
       for( char ch : s.toCharArray() ){
        map.put(ch , map.getOrDefault(ch,0)+1);
       }
       PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(a) != map.get(b) ? map.get(b)-map.get(a) : a);
       for(char ch: map.keySet()){
        pq.add(ch);
       }
       StringBuilder sb = new StringBuilder();
       while(!pq.isEmpty()){
        char ch = pq.poll();
         int n = map.get(ch);
         while(n>0){
            sb.append(ch);
            n--;
         }
       }
       return sb.toString();

    }
}