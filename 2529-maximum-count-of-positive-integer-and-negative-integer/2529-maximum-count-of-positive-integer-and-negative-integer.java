class Solution {
    public int maximumCount(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
        int count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0 && nums[i]!=0){
            count1++;}
            if(nums[i]<0 && nums[i]!=0){count2++;}
          
            maxi=Math.max(maxi,Math.max(count1,count2));

        }
return maxi;
    }
}