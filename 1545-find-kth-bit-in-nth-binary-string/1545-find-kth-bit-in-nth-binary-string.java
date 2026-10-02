class Solution {
    public char findKthBit(int n, int k) {
        String[] dp = new String[n+1];

        String s = generate(n,dp);
        // System.out.println(Arrays.toString(dp));
        return s.charAt(k-1);
    }
    private String generate(int n ,String[] dp){
        if(n==0)return "0";
        if(dp[n]!=null)return dp[n];
        String s = generate(n-1,dp)+"1"+reverse(generate(n-1,dp));
        return dp[n]=s;
    }
    private String reverse(String s){
        // System.out.println(s);
        char[] str = s.toCharArray();
        int i =0;
        int j =s.length()-1;
        for(int k =0;k<str.length;k++){
            if(str[k]=='0')str[k]='1';
            else str[k]='0';
        }
        while(i<=j){
            char ch = str[i];
            str[i]= str[j];
            str[j]= ch;
            i++;
            j--;
        }
        // System.out.println(new String(str));
        return new String(str);
    }

}