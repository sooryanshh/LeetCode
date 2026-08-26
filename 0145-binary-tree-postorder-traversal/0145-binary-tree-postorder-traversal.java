class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        insert(list,root);
        return list;
    }
    public void insert(List<Integer> list,TreeNode root){
        if(root== null )return ;
        insert(list,root.left);
        insert(list,root.right);
        list.add(root.val);
    }
}