class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n,list,0,0,"");
        return list;

    }
    private void generate(int n,List<String> list , int co,int cc,String temp){
        if(co ==n && cc==n){
            list.add(new String(temp));
            return ;
        }
        if(co>n || cc>n || cc>co)return ;
        generate(n,list,co+1,cc,temp+'(');
        generate(n,list,co,cc+1,temp+')');
    }
}