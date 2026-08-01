class Solution {
    public boolean predictTheWinner(int[] nums) {
        return fun(nums,0,0,0,nums.length-1,true);
    }
    boolean fun( int[] nums, int sumA, int sumB, int i,int n, boolean turn){
        if(n<i){
            if(sumA>=sumB)return true;
            else return false;
        }
        if(turn){
           return fun(nums,sumA+nums[i],sumB,i+1,n,false)||
              fun(nums,sumA+nums[n],sumB,i,n-1,false);
        }
        else{
            return fun(nums,sumA,sumB+nums[i],i+1,n,true)&&
              fun(nums,sumA,sumB+nums[n],i,n-1,true);
        }
        
        
        
    }
}