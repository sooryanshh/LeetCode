class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int ans =0;
        for(int i =0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='(')st.push('(');
            else{
                st.pop();
                int n =st.size();
                if(s.charAt(i-1)=='(')ans+=Math.pow(2,n);
            }
        }
        return ans;
    }
}