class Solution {
    public int findBottomLeftValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        levelOrder(root,list);
        return list.get(list.size()-1);
    }
     public void levelOrder(TreeNode root,List<Integer> list) {
        
        if(root== null)return;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
    
                TreeNode temp = q.poll();
                 if(root!=null) list.add(temp.val);
                 if(temp.right != null )q.add(temp.right);
                if(temp.left!=null)q.add(temp.left);
               
               
            
            
        }
        
    }
}