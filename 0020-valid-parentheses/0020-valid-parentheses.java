class Solution {
    public boolean isValid(String s) {
       char[] ans = new char[s.length()];
       int index = -1;
       if(s.length()==1){
        return false;
       }
       for(int i = 0;i< s.length() ; i++){
        if(s.charAt(i)=='(' ||s.charAt(i)=='{' || s.charAt(i)=='['){
            index++;
            ans[index]=s.charAt(i);
        }
        else if(index >=0 &&s.charAt(i)==')' && ans[index]=='(' ){
            index--;
        }
        else if(index >= 0 && s.charAt(i)=='}' && ans[index]=='{'){
            index--;
        }
        else if(index >=0 && s.charAt(i)==']' && ans[index]=='['){
            index--;
        }
        else 
        return false;
       }
       return index==-1  ;
    }
}