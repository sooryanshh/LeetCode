class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l =0;
        int sum =0;
        int ans =0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
            if(i-l+1==k){
                if(sum >=k*threshold)ans++;
                sum-=arr[l++];
            }
        }
        return ans;

    }
}