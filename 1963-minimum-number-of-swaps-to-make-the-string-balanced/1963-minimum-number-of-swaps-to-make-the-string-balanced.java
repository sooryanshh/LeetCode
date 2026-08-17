class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        int ans =0;
        int count =0;
        for(char ch : s.toCharArray()){
            if(ch=='[')st.push(ch);
            else if(!st.isEmpty() &&ch==']' && st.peek()=='[')st.pop();
        }
        int n = st.size();
        if(n%2==0)return n/2;
        else return (n+1)/2;
    }
}