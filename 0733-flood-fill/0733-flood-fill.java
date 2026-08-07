class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)return image;
        colour(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    void colour (int[][] image , int sr , int sc, int color,int val){
        if(sr<0 || sc<0 ||sr>=image.length || sc>=image[0].length|| image[sr][sc]!=val)return;
        image[sr][sc]= color;
        colour(image,sr+1,sc,color,val);
        colour(image,sr-1,sc,color,val);
        colour(image,sr,sc+1,color,val);
        colour(image,sr,sc-1,color,val);
    }
}