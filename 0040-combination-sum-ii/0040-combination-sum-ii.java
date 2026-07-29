class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        helper(temp,list,0,target,candidates);
        return list;
        
    }
    void helper(List<Integer> temp ,List<List<Integer>> list , int s,int target, int[] candidates){
        if(target == 0){
            list.add(new ArrayList<>(temp));
        }
        for(int i =s;i<candidates.length;i++){
            if(candidates[i]>target)return;
             
            temp.add(candidates[i]);
            helper(temp,list,i+1,target-candidates[i],candidates);
            temp.remove(temp.size()-1);
            while(i<candidates.length-1 && candidates[i]==candidates[i+1]){
                i++;
            }
            
           
        }
    }
}