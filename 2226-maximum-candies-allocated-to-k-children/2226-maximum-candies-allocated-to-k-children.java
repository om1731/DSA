class Solution {
    boolean candistr(int[] candies,int mid,long k){
        int n=candies.length;
        long count =0;
        for(int i=0;i<n;i++){
            count+=candies[i]/mid;
            if(count>=k){
                return true;
            }

        }
        return count>=k;
    }

 public int maximumCandies(int[] candies, long k) {
    
      int max=Integer.MIN_VALUE;
      int n=candies.length;
      long total=0;
      for(int i=0;i<n;i++){
        total+=candies[i];
        max=Math.max(max,candies[i]);
      }
   
  if(total<k){
    return 0;
  }
  int l=1, h=(int)max; int result=0;
  while(l<=h){
int mid=(l+h)/2;
    if(candistr(candies,mid,k)){
        result=mid;
        l=mid+1;}
        else{
            h=mid-1;
        }

    }
    return result;
  }
 }