class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list  = new ArrayList<>();
        if(root ==null)return list;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i =0;i<n;i++){
                TreeNode node = q.poll();
                if(node.left!= null)q.add(node.left);
                if(node.right != null)q.add(node.right);
                temp.add(node.val);
            }
            if(flag){
                list.add(temp);
                flag = false;
                }
            else {
                list.add(reverse(temp));
                flag =true;}

            
        }
        return list;
    }
    public List<Integer> reverse(List<Integer> temp ){
        int l = 0;
        int r = temp.size()-1;
        while(l<r){
            int t = temp.get(l);
            temp.set(l,temp.get(r));
            temp.set(r,t);
            l++;
            r--;
        }
        return temp;
    }
}