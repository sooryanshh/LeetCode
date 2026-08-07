class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        permute(ans,0,nums);
        return ans;

    }
    void permute(List<List<Integer>> ans, int s,int[] nums){
        if(s==nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int n : nums){
                temp.add(n);
            }
            ans.add(temp);
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i =s;i<nums.length;i++){
             if(set.contains(nums[i]))continue;
             set.add(nums[i]);
            swap(nums,i,s);
            permute(ans,s+1,nums);
            swap(nums,i,s);
            
        }
    }
    void swap(int[] nums,int i , int s){
        int temp = nums[i];
        nums[i]=nums[s];
        nums[s]=temp;
    }
}