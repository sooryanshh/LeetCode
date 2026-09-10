class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int[] arr : matrix){
            for(int n: arr){
                pq.add(n);
                if(pq.size()> k)pq.poll();
            }
        }
        return pq.peek();
    }
}