
class Solution {
    public int count =0;
    public void helper(TreeNode root, long target){
        if(root== null)return ;
        if(target==root.val)count++;
        helper(root.left,target-root.val);
        helper(root.right , target-root.val);
    }
    public void traverse(TreeNode root, long target){
        if(root== null)return ;
        helper(root,target);
        traverse(root.left,target);
        traverse(root.right,target);
    }
    public int pathSum(TreeNode root, int targetSum) {
        traverse(root,targetSum);
        return count;
    }
}