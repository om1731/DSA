class Solution {
    private int countatmost(int[] nums,int limit){
        if(limit<0){
            return 0;

        }
        int left=0;
        int currsum=0;
        int ct=0;
        for(int right=0;right<nums.length;right++){
            currsum+=(nums[right]%2);
            while(currsum>limit){
                currsum-=(nums[left]%2);
                left++;
            }
            ct+=right-left+1;
        }
        return ct;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return countatmost(nums,k)-countatmost(nums,k-1);
        
    }
}