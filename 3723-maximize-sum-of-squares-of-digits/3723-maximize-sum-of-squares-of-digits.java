class Solution {
    public String maxSumOfSquares(int num, int sum) {
         StringBuilder sb = new StringBuilder();
         while(num>0){
            for(int i =9;i>=0;i--){
                if(sum>=i){
                    sb.append(i);
                    sum-=i;
                    break;
                }                
                
            }
                num--;
           
         } String ans = sum==0 ?new String(sb): "";
            return ans;
}}