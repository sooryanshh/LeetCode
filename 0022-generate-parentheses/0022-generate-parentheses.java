class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
       
        fun(ans,sb,0,0,n);
        return ans;
    }
    void fun(List<String> ans , StringBuilder sb, int co, int cc, int n ){
         if(co==n && cc==n ){
            ans.add(sb.toString());
            return;
        }
        if(co>n || cc>n || cc > co)return;
        
        fun(ans,sb.append('('),co+1,cc,n);
        sb.deleteCharAt(sb.length()-1);
        fun(ans,sb.append(')'),co,cc+1,n);
        sb.deleteCharAt(sb.length()-1);
    }
}