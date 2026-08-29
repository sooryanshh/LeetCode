class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)return list;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int n =q.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0;i<n;i++){
                TreeNode temp = q.poll();
                if(temp.left !=null)q.add(temp.left);
                if(temp.right !=null)q.add(temp.right);
                if(temp.val>max)max = temp.val;
            }
            list.add(max);
        }    
        return list;
    }
}