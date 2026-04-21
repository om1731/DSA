/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      long   low=1;
       long high=n;
      long   mid;
      long   result=n;
        while(low<=high){
          mid=(low+high)/2;
            if(isBadVersion((int)mid)){
                result=mid;
                high=mid-1;}
                else
                low=mid+1;
            }
   return (int)result;
   }}