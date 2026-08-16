class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder sb  = new StringBuilder();
        add(root,list,"");
        return list;
    }
    public void add(TreeNode root, List<String> list,String sb ){
        if(root == null) return ;
        if(root.right == null && root.left == null)list.add(sb+root.val);
        add(root.left,list,sb+root.val +"->");
        
        add(root.right,list,sb+root.val+"->");
    }
}