class Solution {
    public int minDepth(TreeNode root) {
      if(root == null)return 0;
      int left = 1 + minDepth( root.left);
      int right = 1+ minDepth(root.right);
      if(left == 1)return right ;
      if(right == 1)return left;
      return Math.min(left,right);
    }
}