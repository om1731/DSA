class Solution {
    public int[] searchRange(int[] nums, int target) {
        return  new int[]{firstPosition(nums,target),lastPosition(nums,target)};
    }
    private int firstPosition(int[] nums,int target){
        int result=-1;
         int first=0,last=nums.length-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(nums[mid]==target){
           result =mid;
            last=mid-1;}
            else if(nums[mid]<target){
          first= mid+1;}
            else{
           last= mid-1;}}
           return result;
    }
        private int lastPosition(int[] nums,int target){
             int result=-1;
         int first=0,last=nums.length-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(nums[mid]==target){
            result= mid;
            first=mid+1;}
            else if(nums[mid]<target){
          first= mid+1;}
            else{
           last= mid-1;}}
           return result;
        }
    }
