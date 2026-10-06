class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        n= min(n,dp);
        System.out.println(Arrays.toString(dp));
        return n;
    }
    private int min(int n,int[] dp){
        if(n==0)return 0;
        if(dp[n]!=Integer.MAX_VALUE)return dp[n];
        int ans=n;
        for(int i=1;i*i<=n;i++){
        ans = Math.min(ans,1+min(n-i*i,dp));        
        }
        return dp[n]= ans;
    }
}