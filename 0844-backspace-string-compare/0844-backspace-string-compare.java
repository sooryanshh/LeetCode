class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> st = new ArrayDeque<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='#'){
              if(!st.isEmpty())st.pop();
            }
            else st.push(ch);
        }
         Deque<Character> st2 = new ArrayDeque<>();
         for(int i =0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch=='#'){
              if(!st2.isEmpty())st2.pop();
            }
            else st2.push(ch);
        }
        if(st.size()!=st2.size())return false;
        while(!st.isEmpty()){
          char ch = st.pop();
          char ch2 = st2.pop();
          if(ch!=ch2)return false;
         }
         return true;
    }
}