class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        int i =0;
        for(String st: str){
            str[i] = reverse(st.toCharArray(),0,st.length()-1);
            i++;
        }
        return String.join(" ",str);
    }
    public String reverse (char[] s , int l, int r){
        if(l>r)return new String(s);
        char ch = s[l];
        s[l]=s[r];
        s[r]=ch;
        return reverse(s,l+1,r-1);
    }
}