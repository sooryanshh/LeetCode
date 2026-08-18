class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }
    public boolean check(TreeNode l, TreeNode r){
        if(l == null && r == null)return true;
        if(l ==null || r == null )return false;
        if(l.val != r.val)return false;
        boolean left = check(l.left,r.right);
        boolean right = check(l.right,r.left);
        return left && right;
    }
}