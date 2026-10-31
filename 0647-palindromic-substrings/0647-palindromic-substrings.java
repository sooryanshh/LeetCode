class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int[][] dp =new int[n][n];
        int ans =0;
        for(int k =0;k<n;k++){
            int i = 0,j =k;
            while(i<n && j<n){
                if(i==j){
                    dp[i][j]=1;
                    ans++;
                }
                else if(i==j-1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=1;
                        ans++;
                    }
                }
                else {
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1){
                        dp[i][j]=1;
                        ans++;
                    }
                    else dp[i][j]=0;
                
            }
            i++;
            j++;
            
        }
       
    } return ans;
}
}