class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> Math.abs(x-a) != Math.abs(x-b) ? Math.abs(x-b) - Math.abs(x-a) : b-a);
        List<Integer> list = new ArrayList<>();
        for(int n: arr){
            pq.add(n);
            if(pq.size()>k)pq.poll();
        }
        while(!pq.isEmpty()){
            list.add(pq.poll());
        }
        Collections.sort(list);
        return list ;
    }
}