class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int l=1;
        int ans =0;
        long max = Integer.MIN_VALUE;
        while(!q.isEmpty()){
             int n = q.size();
             long sum =0;
             for(int i = 0;i<n;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                sum+=temp.val;
             }
             if(sum>max){
                max = sum;
                ans = l;
             }
             l++;
        }
       return ans;
    }
}