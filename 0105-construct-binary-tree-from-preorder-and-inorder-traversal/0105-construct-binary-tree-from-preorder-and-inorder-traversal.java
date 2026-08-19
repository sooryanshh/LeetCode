class Solution {
    int i =0;
    public int find(int[] arr, int val){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==val) return i;
        }
        return -1;
    }
    public TreeNode build(int[] preorder,int[] inorder, int s,int e ){
        if(s>e )return null;
        TreeNode root = new TreeNode(preorder[i]);
         int rootIdx = find(inorder,preorder[i]);
         i++;
        root.left= build(preorder,inorder,s,rootIdx-1);
        root.right = build(preorder,inorder,rootIdx+1,e);
        return root ;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,preorder.length-1);
        
    }
}