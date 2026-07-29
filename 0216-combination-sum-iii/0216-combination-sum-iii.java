class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int[] arr= {1,2,3,4,5,6,7,8,9};
        if(n>45)return ans;
        generateList(ans,temp,0,n,k,arr);
        return ans;
    }
    void generateList( List<List<Integer>> ans ,List<Integer> temp, int s, int n,int k,int[] arr ){
        if(temp.size()>k )return;
        if(n==0 && temp.size()== k){
            ans.add(new ArrayList<>(temp));
        }
        for(int i =s;i<arr.length;i++){
            if(n<arr[i])return ;
            temp.add(arr[i]);
            generateList(ans,temp,i+1,n-arr[i],k,arr);
            temp.remove(temp.size()-1);
        }
    }
}