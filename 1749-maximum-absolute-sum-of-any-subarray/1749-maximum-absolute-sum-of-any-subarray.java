class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sumMin =0;
        int sumMax=0;
        int min =0;
        int max=0;
        for(int i =0;i<nums.length;i++){
            sumMin+=nums[i];
            sumMax+=nums[i];
            min =Math.min(min,sumMin);
            max = Math.max(max,sumMax);
            if(sumMin>0)sumMin=0;
            if(sumMax<0)sumMax=0;           
        
        }
        return Math.max(Math.abs(min),max);

    }
}