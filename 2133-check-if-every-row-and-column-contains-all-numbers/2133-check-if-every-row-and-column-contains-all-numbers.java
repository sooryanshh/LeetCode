class Solution {
    public boolean checkValid(int[][] matrix) {
        HashSet<Integer> st = new HashSet<>();
        for(int[] arr: matrix){
            for(int n : arr){
                if(st.contains(n))return false;
                st.add(n);
            }
            st.clear();
        }
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                int n =matrix[j][i];
                if(st.contains(n))return false;
                st.add(n);
            }
            st.clear();
        }
        return true;
    }
}