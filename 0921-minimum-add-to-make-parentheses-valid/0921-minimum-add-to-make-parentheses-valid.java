class Solution {
    public int minAddToMakeValid(String s) {
        int co =0;
        int cc=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='(')co++;
            else {
                if(co!=0)co--;
                else cc++;
            }
        }
        return co+cc;
    }
}