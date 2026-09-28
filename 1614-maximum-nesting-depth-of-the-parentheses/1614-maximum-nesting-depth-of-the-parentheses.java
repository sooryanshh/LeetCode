class Solution {
    public int maxDepth(String s) {
        int ans =0;
        int l =0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                l++;
                ans= Math.max(l,ans);
            }
            else if(ch==')')l--;
        }
        return ans;
    }
}