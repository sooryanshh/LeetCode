class Solution {
    public int matrixSum(int[][] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int ans =0;
        int n =nums[0].length;
        while(n-- >0){
            for(int i =0;i<nums.length;i++){
                int max = 0;
                for(int j =0;j<nums[0].length;j++){
                    if(nums[i][j]>nums[i][max])max = j;
                }
                pq.add(nums[i][max]);
                nums[i][max]=0;
            }
            ans+=pq.poll();
            pq.clear();

        }
        return ans;
    }
}