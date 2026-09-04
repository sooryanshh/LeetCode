class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min[] = new int[nums.length];
        int n = nums.length-1;
        int minimum = nums[n];
        for(int i =n; i>=0;i--){
            if(nums[i]<minimum)minimum = nums[i];
            min[i]=minimum;
        }
        int max = nums[0];
        int ans = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]>max)max = nums[i];
            int stability = max -min[i];
            if(stability <= k)return i;
        }
        return -1;
    }
}