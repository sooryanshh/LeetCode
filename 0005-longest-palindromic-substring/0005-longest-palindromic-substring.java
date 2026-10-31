class Solution {
    public String longestPalindrome(String s) {
        int idx =-1;
        int max=-1;
        for(int i =0;i<s.length();i++){
            int len = check(s,i,i);
            // System.out.println(len);
            if(len>max){
                max = len;
                idx = i-max/2;
            }
            len = check(s,i,i+1);
            // System.out.println(len);
            if(len>max){
                max = len;
                idx = i-(max-1)/2;
            }
        }
        // System.out.println("max" + " " + max);
        return s.substring(idx,idx+max);
    }
    int check(String s ,int i ,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        j--;
        i++;
        return j-i+1;
    }
}