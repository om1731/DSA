class Solution {
    private int kdifferent(int[] nums,int limit){
        int ct=0;
        int left=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>limit){
                map.put(nums[left],map.get(nums[left])-1);

            
            if(map.get(nums[left])==0){
                map.remove(nums[left]);
            }
            
            left=left+1;
            }
        
       ct+=right-left+1;}
       return ct;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return kdifferent(nums, k)-kdifferent(nums, k-1);
    }
    }