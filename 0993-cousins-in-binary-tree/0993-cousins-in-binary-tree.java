class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
       Queue<TreeNode> q = new ArrayDeque<>();
       q.add(root);
       while(!q.isEmpty()){
        int n =q.size();
        boolean a = false;
        boolean b = false;
        for(int i =0;i<n;i++){
            TreeNode temp = q.poll();
            if (temp.val==x)a=true;
            if(temp.val== y)b=true;
            if(temp.right!=null &&temp.left!=null){
                if((temp.right.val ==x && temp.left.val ==y )|| (temp.left.val == x && temp.right.val==y))return false;
            }
            if(temp.left!=null)q.add(temp.left);
            if(temp.right !=null)q.add(temp.right);
           }
           if(a && b)return true;
           if((!a && b) ||(a && !b)) return false;
       } 
       return false;
    }
}