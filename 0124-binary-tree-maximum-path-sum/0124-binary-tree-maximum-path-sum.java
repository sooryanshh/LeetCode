class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return ans;
    }
    public int maxSum(TreeNode root){
        if(root == null)return 0;
        int left = Math.max(0,maxSum(root.left));
        int right = Math.max(0,maxSum(root.right));
        int curr =root.val+left+right;
        ans = Math.max(curr,ans);
        return root.val + Math.max(left,right);
    }
}