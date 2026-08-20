
class Solution {
    public void flatten(TreeNode root) {
        if(root==null)return;
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right= root.left;
        root.left = null;
        TreeNode node = root;
        while(node.right!=null){
            node = node.right;
        }
        node.right = temp;
    }
}