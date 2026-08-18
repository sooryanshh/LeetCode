
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        insert(list,root);
        return list;
        
    }
    public void insert(List<Integer> list,TreeNode root){
        if(root== null )return ;
        list.add(root.val);
        insert(list,root.left);
        insert(list,root.right);
    }
}