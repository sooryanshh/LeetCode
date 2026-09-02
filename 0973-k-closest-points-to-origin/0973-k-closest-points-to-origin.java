class Solution {
    public class pair{
        int[] arr ;
        int val;
        public pair(int[] arr, int val){
             this.arr = arr;
             this.val = val;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> b.val -a.val);
        for(int i =0;i<points.length;i++){
            int a = points[i][0];
            int b = points[i][1];
            int d = a*a+b*b;
            pq.add(new pair(points[i],d));
            if(pq.size()>k)pq.poll();
        }
        int[][] ans = new int[k][2];
        int i =0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll().arr;
        }
        return ans;
    }
}