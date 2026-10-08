class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
           char ch = s.charAt(i);
           if(ch=='('){
             st.push('(');
             if(st.size()>1)sb.append(ch);
           }
           else {
              if(st.size()>1)sb.append(ch);
              st.pop();
           }
        }
        return new String(sb);
    }
}