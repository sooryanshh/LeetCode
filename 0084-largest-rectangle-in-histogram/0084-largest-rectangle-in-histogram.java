class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        for(int i =0;i<n;i++){
            nse[i]=n;
            pse[i]=-1;
        }
        helper(heights, nse,pse);
        System.out.println(Arrays.toString(nse));
        System.out.println(Arrays.toString(pse));
        int ans = 0;
        for(int i =0;i<n;i++){
            int curr = (nse[i]-pse[i]-1)*heights[i];
            ans =Math.max(curr,ans);
        }
        return ans;
    }
    public void helper(int[] heights, int[] nse, int[] pse){
        Stack<Integer> st = new Stack<>();
        // finding the next smaller index 
        for(int i =0; i<heights.length; i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                nse[st.peek()]=i;
                st.pop();
            }
            st.push(i);

        }
        while(!st.isEmpty()){
                st.pop();
        }
        // finding the previous smaller index 
        for(int i = heights.length-1; i>=0;i--){
            while(!st.isEmpty() && heights[i] <heights[st.peek()]){
                pse[st.peek()]= i;
                st.pop();
            }
            st.push(i);
        }


    }
}