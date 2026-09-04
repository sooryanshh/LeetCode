class Solution {
    public int longestUnivaluePath(TreeNode root) {
        if(root == null)return 0;
       return traverse(root);
    }
    private int traverse(TreeNode root){
        if(root == null)return 0;
        int left =traverse(root.left);
        int right = traverse(root.right);
        int curr = count(root.left,root.val)+count(root.right,root.val);
        return Math.max(left,Math.max(right,curr));
    }
    private int count(TreeNode root,int value){
        if(root == null)return 0;
        if(root.val !=value)return 0;
        int left = count(root.left,value);
        int right = count(root.right,value);
        return 1+Math.max(left,right);
    }
}