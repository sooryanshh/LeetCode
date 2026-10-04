class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='(')st.push(i);
            else if(ch==')'){
                if(!st.isEmpty())st.pop();
                else if(!st2.isEmpty())st2.pop();
                else return false;

            }
            else if(ch=='*'){
              st2.push(i);
            }
        }
        System.out.println(st);
        System.out.println(st2);
        while(!st.isEmpty() && !st2.isEmpty()){
           if(st2.pop()<st.pop() )return false;
           
        }
        return st.size()==0;
    }
}