class Solution {
    int ans =0;
    public int averageOfSubtree(TreeNode root) {
        check(root);
        return ans;
    }
    private int count(TreeNode root ){
        if(root == null)return 0;
        return 1+count(root.left)+count(root.right);

    }
    private int check(TreeNode root){
        if(root == null)return 0;
        int sum = root.val+check(root.left)+check(root.right);
        System.out.print(sum +" ");
        int count = count(root);
        System.out.print(count +" ");
        if(root.val==sum/count)ans++;
        System.out.println(ans);
        return sum;
    }
}