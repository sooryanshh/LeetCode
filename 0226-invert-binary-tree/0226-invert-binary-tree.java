
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null )return null;
        TreeNode temp = root.left;
        root.left = root.right;
        invertTree(root.left);
        root.right = temp;
        invertTree(root.right);
        return root ;
    }
}