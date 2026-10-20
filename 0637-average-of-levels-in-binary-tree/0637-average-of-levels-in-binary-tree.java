class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        List<Double> list = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            double sum = 0;
            int n =q.size();
            for(int i =0;i<n;i++){
                TreeNode temp = q.poll();
                sum+=temp.val;
                if(temp.left !=null)q.add(temp.left);
                if(temp.right !=null)q.add(temp.right);
            }
            list.add(sum/(double)n);
            
        }
        return list;
    }
}