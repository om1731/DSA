class tuple{
    int dist;
    int row;
    int col;
    public tuple(int dist,int row,int col){
        this.row=row;
        this.col=col;
        this.dist=dist;
    }
}

 
 class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<tuple>pq=new PriorityQueue<tuple>((x,y)->x.dist-y.dist);
        int n=heights.length;
        int m=heights[0].length;
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=(int)(1e9);}}
                dist[0][0]=0;
                pq.add(new tuple(0,0,0));
                int dr[]={-1,0,1,0};
                int dc[]={0,1,0,-1};
                while(pq.size()!=0){
                    tuple it=pq.peek();
                    pq.remove();
                    int diff=it.dist;
                    int row=it.row;
                    int col=it.col;
                    if(row==n-1 && col==m-1)return diff;
                    for(int i=0;i<4;i++){
                        int newr=row+dr[i];
                        int newc=col+dc[i];
                        if(newr>=0 && newc>=0 && newr<n && newc<m){
                            int neweffort=Math.max(Math.abs(heights[row][col]-heights[newr][newc]),diff);
                            if(neweffort<dist[newr][newc]){
                                dist[newr][newc]=neweffort;
                                pq.add(new tuple(neweffort,newr,newc));                            
                        }
                    }
                
                }
            }        
        return 0;
    }
}