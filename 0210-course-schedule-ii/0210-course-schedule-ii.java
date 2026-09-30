class Solution {
    private boolean dfscheck(int node,int vis[],int pathvis[],ArrayList<ArrayList<Integer>>adj){
        vis[node]=1;
        pathvis[node]=1;
        for(int it:adj.get(node)){
            if(vis[it]==0){
            if(dfscheck(it,vis,pathvis,adj)==true)
            return true;
        }
        else if(pathvis[it]==1){
        return true;}
    }
    pathvis[node]=0;
    return false;
    }
    private void dfs(int node,int vis[],ArrayList<ArrayList<Integer>>adj,Stack<Integer>st){
        vis[node]=1;
        for(int it:adj.get(node)){
         if(vis[it]==0)
         dfs(it,vis,adj,st);
        }
        st.push(node);
    }
    public boolean isCyclic(int v,ArrayList<ArrayList<Integer>>adj){
        int vis[]=new int[v];
        int pathvis[]=new int[v];
        for(int i=0;i<v;i++){
            if(vis[i]==0){
                if(dfscheck(i,vis,pathvis,adj)==true)
                return true;
            }
        }
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
        adj.add(new ArrayList<>());
        }
        for(int[] it:prerequisites){
        adj.get(it[1]).add(it[0]);
        }
        if(isCyclic(numCourses,adj)){
        return new int[0];}
        int vis[]=new int[numCourses];
        Stack<Integer>st=new Stack<>();
       
        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){
                dfs(i,vis,adj,st);
            }

        }
        
        int ans[]=new int[numCourses];
        int i=0;
        while(!st.isEmpty()){
            ans[i++]=st.peek();
            st.pop();
        }
        return ans;
    }
}