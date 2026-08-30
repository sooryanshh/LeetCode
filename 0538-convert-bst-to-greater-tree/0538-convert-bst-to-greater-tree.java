class Solution {
    int sum =0;
    public TreeNode convertBST(TreeNode root) {
            if(root == null)return null;
            TreeNode right = convertBST(root.right);
            int temp = root.val;
            root.val +=sum;
            sum+=temp;
            TreeNode left = convertBST(root.left);
        
        return root;
    }
    
}