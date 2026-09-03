class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
         List<List<Integer>> list = new ArrayList<>();
         find(list,0,new ArrayList<>(),nums,new HashSet<>());
         return list;

    }
    private void find( List<List<Integer>> list , int i,List<Integer> temp,int[] arr,Set<List<Integer>> set){
        if(temp.size()>1){            
           if(temp.get(temp.size()-1)>=temp.get(temp.size()-2)) {
                if(!set.contains(temp)){
                    list.add(new ArrayList<>(temp));
                    set.add(new ArrayList<>(temp));
                    }}
            else return ;
                
        }
        if(i>= arr.length)return;
        
        temp.add(arr[i]);       
        find(list,i+1,temp,arr,set);
        temp.remove(temp.size()-1);
        find(list,i+1,temp,arr,set);
        
        }
}