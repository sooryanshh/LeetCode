class Solution {
    int idx = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] inorder= new int[preorder.length];
        for(int i = 0;i<preorder.length;i++){
            inorder[i]=preorder[i];
        }
        Arrays.sort(inorder);
        return build(preorder,inorder,0,preorder.length-1);
    }
    private TreeNode build(int[] preorder,int[] inorder,int s,int e){
         if(s>e)return null;
         int rootIdx = search(inorder,preorder[idx]);
         TreeNode root = new TreeNode(preorder[idx]);
         idx++;
         root.left = build(preorder,inorder,s,rootIdx-1);
         root.right =build(preorder,inorder,rootIdx+1,e);
         return root;
    }
    
    private int search(int[] arr,int val){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(arr[mid]== val)return mid;
            else if(arr[mid]>val)e = mid-1;
            else s = mid+1;
        }
        return -1;
    }
}