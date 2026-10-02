class Solution {
    public int minimumTotal(List<List<Integer>> list) {
        int n =list.size();
        for(int i =n-2;i>=0;i--){
            for(int j =0;j<list.get(i).size();j++){
                list.get(i).set(j,list.get(i).get(j)+Math.min(list.get(i+1).get(j),list.get(i+1).get(j+1)));
            }
        }
        return list.get(0).get(0);
    }
}