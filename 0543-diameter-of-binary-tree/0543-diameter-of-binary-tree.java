class Solution {
    int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return d;
    }
    private int diameter(TreeNode root){
        if(root == null)return 0;
        int left = diameter(root.left);
        int right = diameter(root.right);
        d = Math.max(d,left+right);
        return 1+Math.max(left,right);
    }
}