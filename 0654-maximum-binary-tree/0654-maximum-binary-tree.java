class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums,0,nums.length-1);
    }
    private TreeNode build(int[] nums ,int left,int right){
        if(left>right)return null;
        int max = left;
        for(int i =left+1;i<=right;i++){
            if(nums[i]>nums[max])max = i;
        }
        TreeNode root = new TreeNode(nums[max]);
        root.left = build(nums,left,max-1);
        root.right = build(nums,max+1,right);
        return root;
    }
}