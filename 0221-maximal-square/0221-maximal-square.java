class Solution {
    public int maximalSquare(char[][] matrix) {
        int max=0;
        int n =matrix.length;
        int m= matrix[0].length;
        int[][] arr = new int[n][m];
        //  for(int i =0;i<n;i++){
        //     System.out.println(Arrays.toString(matrix[i]));
        // }
        // System.out.println("-------------------------------------------");
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                arr[i][j]=matrix[i][j]-'0';
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(i!=0 && j!=0){
                    if(arr[i][j]==1)
                    arr[i][j]+= Math.min(arr[i-1][j],Math.min(arr[i-1][j-1],arr[i][j-1]));
                }
                max = Math.max(arr[i][j]*arr[i][j],max);
            }
        }
        // for(int i =0;i<n;i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        return max;
    }
}