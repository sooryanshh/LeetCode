class Solution {
    public int maxScore(String s) {
        int ans = 0;
        int[] arr = new int[s.length()];
        int ones=0;
        int zeros = 0;
        if(s.charAt(0)=='0')zeros++;
        for(int i= s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1')ones++;
            arr[i]=ones;
        }
        for(int i = 1;i<s.length();i++){
            if(i!=s.length()-1 && s.charAt(i)=='0')zeros++;
            ans = Math.max(ans,zeros+arr[i]);
        }
        return ans;
    }
}