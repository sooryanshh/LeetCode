class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> temp = new  ArrayList<>();
       fun(ans, temp,candidates,target,0,0);
       return ans;
    }
    void fun(List<List<Integer>> ans ,List<Integer> temp,int[] candidates,int target , int sum ,int i ){
        if(target == sum){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        if(target<sum)return;
        if(i==candidates.length)return;
        temp.add(candidates[i]);
        sum+=candidates[i];
        fun(ans,temp,candidates,target,sum,i);
        sum-=candidates[i];
        temp.remove(temp.size()-1);
        fun(ans,temp,candidates,target,sum,i+1);

    }
}