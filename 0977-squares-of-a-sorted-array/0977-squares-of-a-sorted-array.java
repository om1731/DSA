class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0,right=n-1;
        int[] ans =new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                ans[k++]=nums[left]*nums[left];
                left++;
            }else{ans[k++]=nums[right]*nums[right];
            right--;}}

            reverse(ans);
            return ans ;

            }
            public void reverse(int[] nums){
                int left=0,right=nums.length-1;
               while(left<right){
                
                        swap(nums,left,right);
                        left++;
                        right--;
                    }
                }
                
            
            public void swap(int[] nums,int left,int right){
                int  temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
            }

     