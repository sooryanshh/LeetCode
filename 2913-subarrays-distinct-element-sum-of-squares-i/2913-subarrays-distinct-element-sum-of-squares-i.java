class Solution {
    public int sumCounts(List<Integer> nums) {
        Set<Integer> st = new HashSet<>();
        int ans =0;
        for(int i =0;i<nums.size();i++){
            for(int j =i;j<nums.size();j++){
                st.add(nums.get(j));
                ans +=st.size()*st.size();
            }
            st.clear();
        }
        return ans ;
    }
}