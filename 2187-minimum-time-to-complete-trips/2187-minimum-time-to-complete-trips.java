class Solution {
    boolean possible(int[] time,long mid,int totalTrips){
        int n=time.length;
        long actualtime=0;
        for(int i=0;i<n;i++){
            actualtime+=mid/time[i];
        
        if(actualtime>=totalTrips){
            return true;}

        }
return actualtime>=totalTrips;
    }
  
          
    
    public long minimumTime(int[] time, int totalTrips) {  int n=time.length;
          int min=Integer.MAX_VALUE;
          for(int i=0;i<n;i++){
            min=Math.min(min,time[i]);
          }
          
        
     
        
        long l=1,h=(long)min*totalTrips;
        while(l<h){
            long mid=(l+h)/2;
            if(possible(time,mid,totalTrips)){
                h=mid;
            }
            else{
                l=mid+1;
            }
            }
            return l;
        }

        
    }
