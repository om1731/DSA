class Solution {
    int func(int[] weights,int cap){
        int n=weights.length;
  int days=1,load=0;
  for(int i=0;i<n;i++){
    if(load+weights[i]>cap){
        days=days+1;
        load=weights[i];
    }
    else{
        load+=weights[i];
    }}
    return days;
  }
    

    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;int maxweight=Integer.MIN_VALUE;
        int maxsum=0;
        for(int i=0;i<n;i++){
            maxweight=Math.max(maxweight,weights[i]);
maxsum+=weights[i];
        }
int low=maxweight,high=maxsum;
while(low<=high){
    int mid=(low+high)/2;
   int noofdays=func(weights,mid);
    if(noofdays<=days){
        high=mid-1;}
        else{
            low=mid+1;
        }}
        return low;
    }
}

        
    
