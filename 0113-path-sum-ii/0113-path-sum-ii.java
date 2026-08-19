class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(root,targetSum,list,temp);
        return list;
    }
    public void helper(TreeNode root , int targetSum,List<List<Integer>> list, List<Integer> temp  ){
        if(root == null)return ;
        if(targetSum == root.val && (root.left ==null && root.right == null)){
            temp.add(root.val);
            list.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        temp.add(root.val);
             System.out.println(temp);
        helper(root.left,targetSum-root.val,list,temp);
        
        
         System.out.println(temp);
        helper(root.right,targetSum-root.val,list,temp);
         temp.remove(temp.size()-1);
         System.out.println(temp);
        
    }
}