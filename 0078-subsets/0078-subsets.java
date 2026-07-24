class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        fun(ans,temp,nums,0);
        return ans ;
    }
    void fun(List<List<Integer>> ans,List<Integer> temp,int[] nums,int i){
       if(i==nums.length){
          ans.add(new ArrayList<>(temp));
          return;
       }
       temp.add(nums[i]);
       fun(ans,temp,nums,i+1);
       temp.remove(temp.size()-1);      
       fun(ans,temp,nums,i+1);
    }
}