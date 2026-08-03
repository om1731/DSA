class Solution {
    boolean possible(int[] bloomDay, long day,int m,int k){
        int n=bloomDay.length;
        int ct=0,nobouquets=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=day){
                ct++;}
                else{
                    nobouquets+=(ct/k);
                    ct=0;
                }
                }
                nobouquets+=(ct/k);
                if(nobouquets>=m)return true;
                else return false;
            }
        
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        long min=Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        if(n<(long)m*k)return -1;

    long l=min,h=max, result=max;
    while(l<=h){
        long mid=(l+h)/2;
        if(possible( bloomDay,mid,m,k)==true){
            result=mid;
            h=mid-1;
        }
        else{
            l=mid+1;
        }

        }
        return (int)l;
       
    }
}