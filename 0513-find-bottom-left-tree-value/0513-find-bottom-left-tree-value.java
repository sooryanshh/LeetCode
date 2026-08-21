class Solution {
    int ans =0;
    public int findBottomLeftValue(TreeNode root) {
        int level = height(root);
        find(root,level,1);
        return ans;
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void find(TreeNode root,int level,int h){
        if(root==null)return;
        if(h==level){
            ans = root.val;
            return;
        }
        find(root.right,level,h+1);
        find(root.left,level,h+1);
    }
}