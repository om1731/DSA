class Solution {
    int firstappear(int[] nums, int target) {
       
       
        int n=nums.length;
        int ans=-1;
        int f=0,l=n-1;
        while(f<=l){
            int mid=(f+l)/2;
          
            
            
              if(nums[mid]==target){
                   ans=mid;
                      l=mid-1;
                  }
else if (nums[mid]<target){
    f=mid+1;}
    else{
        l=mid-1;
    }
}        
return ans;
    }
                  int lastappear(int[] nums, int target) {
    
         int n=nums.length;
        int ans=-1;
        int f=0,l=n-1;
        while(f<=l){
            int mid=(f+l)/2;
          if(nums[mid]==target){
              ans=mid;
              f=mid+1;
          }
            
            
              else if(nums[mid]<target){
                  
                      f=mid+1;
                  }
else{
    l=mid-1;}
}        
return ans;}
    public List<Integer> targetIndices(int[] nums, int target) {
         Arrays.sort(nums);
         int first=firstappear( nums,  target);

        if(first==-1){
     
            ArrayList<Integer>res=new ArrayList<>();
          
           return res;
        }
        int last=lastappear(nums,target);
     

       ArrayList<Integer>res=new ArrayList<>();
          for(int i=first;i<=last;i++){
            res.add(i);
          }
       return res;
}}
    