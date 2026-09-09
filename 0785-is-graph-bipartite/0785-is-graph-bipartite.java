class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
       Queue<Integer> q = new ArrayDeque<>();
       int[] colours = new int[n];
       for(int i =0;i<colours.length;i++){
        if(colours[i]==0)bfs(graph,colours,i);
       }
       for(int i =0;i<graph.length;i++){
        for(int ele : graph[i]){
            if(colours[i]==colours[ele])return false;
        }
       }
       return true;
    
}
    private void bfs(int[][] graph,int[] colours,int start){
        Queue<Integer> q = new ArrayDeque<>();
         q.add(start);
       colours[start]=1; 
       
       while(!q.isEmpty()){
        int front = q.poll();
        int colour = -colours[front];

        for(int node : graph[front]){
           if(colours[node]!=0 )continue;
           if(colours[node]==0){
            q.add(node);
            colours[node]=colour;
           }
        }
       }
    }   
}