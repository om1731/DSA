class Solution {
    public int maxi(int[] nums){
   //  public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);

        }
        return maxi;
    }
    public int sumofno(int[] nums,int div){
        int n=nums.length;
     //   for(int d=1;d<=maxi(nums);d++){
            int s=0;
            for(int i=0;i<n;i++){
                s=s+(int)Math.ceil((double)nums[i]/div);
            }
            return s;
        }
    
   public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1,high=maxi(nums),ans=-1,s=0;
        while(low<=high){
            int mid=(low+high)/2;
           
            if(sumofno(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
        }}
            return ans;
        }}