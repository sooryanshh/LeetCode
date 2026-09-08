class Solution {
    public int findCircleNum(int[][] isConnected) {
        int ans =0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        for(int i =0;i<n;i++){
            if(!visited[i]){
                ans++;
                dfs(isConnected,i,visited);
                  }
        }
        return ans;
    } 
   private void dfs(int[][] connected,int node,boolean[] visited){
     visited[node]=true;
     for(int i =0;i<connected[node].length;i++){
        if(connected[node][i]==1 &&!visited[i])dfs(connected,i,visited);
     }
   }

}