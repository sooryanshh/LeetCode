class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq =new PriorityQueue<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
             int n = q.size();
             long sum =0;
             for(int i = 0;i<n;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                sum+=temp.val;
             }
             pq.add(sum);
             if(pq.size()>k)pq.poll();
        }
        if(pq.size()<k)return -1;
        return pq.poll();
    }
}