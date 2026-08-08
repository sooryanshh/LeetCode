class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        int ans =0;
        for(char ch:s.toCharArray()){
            if(ch=='(')st.push(ch);
            else if(!st.isEmpty() && ch ==')' && st.peek()=='(')st.pop();
            else ans++;
        }
        return ans+st.size();
    }
}