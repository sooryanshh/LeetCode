class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n :nums){
            pq.add(n);
        }
        for(int i =0;i<k;i++){
           pq.add(pq.poll()+1);
        }
        long ans =1;
        while(!pq.isEmpty()){
            
            ans=(ans*pq.poll())%1000000007;
        }
        return (int)ans;

    }
}