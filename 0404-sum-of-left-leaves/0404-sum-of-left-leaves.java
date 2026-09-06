class Solution {
    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
       sum(root,false);
       return ans;
    }
    private void sum(TreeNode root,boolean flag){
        if(root == null)return ;
        if(root.left == null && root.right == null){
            if(flag){
                ans+=root.val;
                return;}
            else return ;
        }
        
       sum(root.left,true);
        sum(root.right,false);
        
    }
}