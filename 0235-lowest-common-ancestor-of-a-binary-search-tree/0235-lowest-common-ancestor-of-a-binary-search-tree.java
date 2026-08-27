class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root ==p || root == q )return root;
       
        TreeNode left;
        TreeNode right ;
        if( p.val>root.val && q.val>root.val){
           return lowestCommonAncestor(root.right,p,q);
           
        }
        else if( p.val<root.val && q.val<root.val){
             return lowestCommonAncestor(root.left,p,q);
           
        }
        else if(p.val<root.val && q.val>root.val){
            left = lowestCommonAncestor(root.left ,p,q);
            right = lowestCommonAncestor(root.right,p,q);
        }
        else {
             left = lowestCommonAncestor(root.right,p,q);
             right = lowestCommonAncestor(root.left ,p,q);
           
        }
        if(left !=null && right !=null )return root;
        if(left !=null)return left;
        return right;
    }
}