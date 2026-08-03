class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            ans[i]=-1;
        }
        int cycle = 0;
        for(int i =0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                ans[st.peek()]=nums[i];
                st.pop();
            }
            st.push(i);
            
        }
        for(int i =0;i<nums.length -1;i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                ans[st.peek()] = nums[i];
                st.pop();
            }
        }

        return ans;
    }
}