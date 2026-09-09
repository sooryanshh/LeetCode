class Solution {
    public int numSpecial(int[][] mat) {
       int ans = 0;
       for(int i =0;i<mat.length;i++){
        for(int j =0;j<mat[i].length;j++){
            if(mat[i][j]==1){
                if(check(mat,i,j))ans++;
                break;
            }
        }
       }
       return ans;
    }
    private boolean check(int[][] arr,int i ,int j){
        int count =0;
        for(int  n: arr[i]){
            if(n==1)count++;
            if(count ==2)return false;
        }
        for(int k =0;k<arr.length;k++){
            if(arr[k][j]==1)count++;
            if(count==3)return false;
        }
        return true;
    }
}