class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        q.add(0);
        visited[0]= true;
        while(!q.isEmpty()){
            int front = q.poll();
            for(int i=0;i<rooms.get(front).size();i++){
                int key = rooms.get(front).get(i);
                if(!visited[key]){
                    q.add(key);
                    visited[key] = true;
                }
            }
        }
        for(int i =0;i<n;i++){
            if(visited[i]==false)return false;
        }
        return true;
    }
}