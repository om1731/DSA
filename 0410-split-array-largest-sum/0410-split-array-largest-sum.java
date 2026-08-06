class Solution {
     boolean isPossible(int []nums, int k, int maxallocatedtime){
        int painters=1,time=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(time+nums[i]<=maxallocatedtime){
                time+=nums[i];}
                else{
                    painters++;
                    time=nums[i];
                }
            }
            return painters<=k;
        }
    public int splitArray(int[] nums, int k) {
        
     int n=nums.length;int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            sum+=nums[i];
        }
        int low=max,high=sum,ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(nums,k,mid)){
                ans =mid;
                high=mid-1;}
                else{
                    low=mid+1;
                    
                }
            }
            return ans;
        }
    }