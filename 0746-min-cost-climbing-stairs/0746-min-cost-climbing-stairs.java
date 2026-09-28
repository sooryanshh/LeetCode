class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int ans =0;
        int first = cost[0];
        int second = cost[1];
        for(int i =2;i<cost.length;i++){
            ans = cost[i]+Math.min(first,second);
            first =second;
            second = ans ;
        }
        return Math.min(first,second);
    }
}