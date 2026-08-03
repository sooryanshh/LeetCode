class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums2.length;i++){
            while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
                map.put(nums2[st.peek()],nums2[i]);
                st.pop();
            }
            st.push(i);
        }
        for(int i =0;i<nums1.length;i++){
            if(map.containsKey(nums1[i]))
            ans[i]=map.get(nums1[i]);
            else ans[i]=-1;
        }
        return ans;
    }
}