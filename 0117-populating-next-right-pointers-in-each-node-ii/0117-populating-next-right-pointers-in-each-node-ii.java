class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new ArrayDeque<>();
        if(root ==null)return root;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i =0;i<n;i++){
                Node temp = q.poll();
                if(temp.left!=null)q.add(temp.left);
                if(temp.right !=null)q.add(temp.right);
                if(i==n-1)temp.next = null;
                else temp.next = q.element();
            }
        }
        return root;
    }
}