class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
         boolean[] visited = new boolean[n];
         int ans = 0;
        dfs(rooms,visited,0);
        for(boolean key : visited){
            if(!key)return false;
        }
        return true;
    }
    private void dfs(List<List<Integer>> rooms,boolean[] visited,int node){
        visited[node]=true;
        for(int n  : rooms.get(node)){
           
            if(!visited[n])dfs(rooms,visited,n);
            
        }
    }
}