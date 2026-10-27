class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length(),m = word2.length();;
        int[][] dp = new int[n][m];
        for(int i =0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return minDis(word1,word2,0,0,dp);
    }
    private int minDis(String a,String b ,int i ,int j,int[][] dp){
        if(j==b.length())return a.length()-i;
        if(i==a.length())return b.length()-j;  
        if(dp[i][j]!=-1)return dp[i][j];      
        if(a.charAt(i)==b.charAt(j)){
            return  minDis(a,b,i+1,j+1,dp);
        }
        int replace = 1+minDis(a,b,i+1,j+1,dp);
        int del = 1+minDis(a,b,i+1,j,dp);
        int insert = 1+minDis(a,b,i,j+1,dp);
        return dp[i][j]=Math.min(replace,Math.min(del,insert));
    }
}