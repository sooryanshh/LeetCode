class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n: piles){
            pq.offer(n);
        }
        for(int i =0;i<k;i++){
            int pile =pq.poll();
            pile -=pile/2;
            pq.offer(pile); 
        }
        int ans = 0;
        for(int n:pq){
            ans+=n;
        }
        return ans;
    }
}