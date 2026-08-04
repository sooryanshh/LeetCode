class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[n-k+1];
        int[] nge = new int[n];
        for(int i =0;i<n;i++){
            nge[i]=n;
        }
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                nge[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        int j =0;
        int l=0;
        for(int i =0;i<n-k+1;i++){
            if(j>i+k-1)j=i;
            int max =nums[j];
            while(j<i+k){
                max = nums[j];
                j = nge[j];
            }
            arr[l++]=max;

        }
        return arr;


    }
}