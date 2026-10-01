class Solution {
    private boolean dfscheck(int node,int vis[],int pathvis[],ArrayList<ArrayList<Integer>>adj,int check[]){
        vis[node]=1;
        pathvis[node]=1;
        check[node]=0;
        for(int it:adj.get(node)){
            if(vis[it]==0){
            if(dfscheck(it,vis,pathvis,adj,check)==true)
            return true;
        }
    
    else if(pathvis[it]==1){
    return true;}}
    check[node]=1;
    pathvis[node]=0;
    return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

       
        for(int i=0;i<n;i++){
        for(int it:graph[i]){
            adj.get(i).add(it);
        }
        }
        int vis[]=new int[n];
        int pathvis[]=new int[n];
        int check[]=new int [n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfscheck(i,vis,pathvis,adj,check);
            
            }
        }
    List<Integer>safestates=new ArrayList<>();
    for(int i=0;i<n;i++){
        if(check[i]==1)
       safestates.add(i);
    }
        return safestates;
    }
}