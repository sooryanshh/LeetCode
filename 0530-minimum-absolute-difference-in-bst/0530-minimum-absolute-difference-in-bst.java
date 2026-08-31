class Solution {
    int ans = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        minDiff(root);
        return ans;
    }
    private void minDiff(TreeNode root){
        if(root == null )return;
        minDiff(root.left);
        if(prev!=null){
            int diff = Math.abs(prev.val - root.val);
            ans = Math.min(ans,diff);
        }
        prev = root;
        minDiff(root.right);
    }
}