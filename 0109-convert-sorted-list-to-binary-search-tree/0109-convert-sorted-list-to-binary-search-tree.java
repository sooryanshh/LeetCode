class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        return build(list,0,list.size()-1);
    }
    private TreeNode build(List<Integer> list,int s, int e){
        if(s>e)return null;
        int mid = s+(e-s)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = build(list,s,mid-1);
        root.right = build(list,mid+1,e);
        return root;
    }
}