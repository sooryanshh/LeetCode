class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        // StringBuilder sb = new StringBuilder();
        String sb ="";
        fun(ans,sb,0,0,n);
        return ans;

    }
    void fun(List<String> ans , String sb, int co, int cc, int n ){
         if(co==n && cc==n ){
            ans.add(sb.toString());
            return;
        }
        if(co>n || cc>n || cc > co)return;
       
        fun(ans,sb+'(',co+1,cc,n);
        fun(ans,sb+')',co,cc+1,n);
    }
}