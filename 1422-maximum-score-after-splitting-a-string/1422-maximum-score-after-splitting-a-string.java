class Solution {
    public int maxScore(String s) {
        int ans = 0;
        int zeros=0;
        for(int i = 0;i<s.length();i++){
            int ones = 0;
            if(i!= s.length()-1 && s.charAt(i)=='0')zeros++;
            for(int j = i+1;j<s.length();j++){
                if(s.charAt(j)=='1')ones++;
            }
            ans = Math.max(ans,ones+zeros);
        }
        return ans;
    }
}