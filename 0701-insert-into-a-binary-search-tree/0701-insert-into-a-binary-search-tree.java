
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode temp = new TreeNode(val);
            root = temp;
            return root;
        }
       change(root,val);
       return root;
    }
    public void change(TreeNode root,int val){
         
         if(root.left==null && root.right==null){
            TreeNode node = new TreeNode(val);
            if(root.val>val)root.left=node;
            else root.right =node ;
            return ;
        }
        if(val<root.val && root.left ==null){
            TreeNode node = new TreeNode(val);
            root.left =node;
            return;
        }
        if(val>root.val && root.right == null){
            TreeNode node = new TreeNode(val);
            root.right= node;
            return;
        }
        if(val<root.val) insertIntoBST(root.left,val);
        else  insertIntoBST(root.right,val);
    }
}