class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            list.add(temp);
        }
        for(int[] edge: edges){
            int a =edge[0];
            int b = edge[1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        q.add(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int front = q.poll();
            for(int x : list.get(front)){
                if(!visited[x]){
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
        return visited[destination];
    }
}