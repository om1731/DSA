class Solution {
    void dfs(int[][] image, int i, int j, int newcolor,int orgcolor){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!=orgcolor || image[i][j]==newcolor){
            return;
        }
        image[i][j]=newcolor;
        dfs( image,i-1,j,newcolor,orgcolor);
         dfs( image,i,j+1,newcolor,orgcolor);
          dfs(image,i,j-1,newcolor,orgcolor);
           dfs( image,i+1,j,newcolor,orgcolor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
        
    }
}