class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : stones){
            pq.add(n);
        }
        while(!pq.isEmpty()){
            if(pq.size()== 1)return pq.poll();
            int st1 = pq.poll();
            int st2 = pq.poll();
            
            if(st1 != st2){
                pq.add( st1-st2);
            }
        }
        return 0;
    }

}