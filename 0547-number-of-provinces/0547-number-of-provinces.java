class Solution {
    public int findCircleNum(int[][] isConnected) {
        int ans =0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        for(int i =0;i<n;i++){
            if(!visited[i]){
                ans++;
                bfs(isConnected,i,visited);
                  }
        }
        return ans;
    } 
    private void bfs(int[][] arr,int start,boolean[] visited){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
           int node = q.poll();
           for(int i  = 0;i<arr.length;i++){
            if(arr[node][i]==1 && !visited[i]){
                visited[i]=true;
                q.add(i);
            }
           } 
        }
    } 

}