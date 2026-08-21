class Solution {
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrder(root,list);
        return list.get(list.size()-1).get(0);
    }
     public void levelOrder(TreeNode root,List<List<Integer>> list) {
        
        if(root== null)return;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> tempL = new ArrayList<>();
            for(int i =0;i<n;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null)q.add(temp.left);
                if(temp.right != null )q.add(temp.right);
                tempL.add(temp.val);
            }
            list.add(tempL);
        }
        
    }
}