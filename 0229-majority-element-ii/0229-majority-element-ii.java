class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int threshold = n / 3;
        
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        int ct1 = 0, ct2 = 0;
        
        // Pass 1: Find candidates
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            
            if (num == el1) {
                ct1++;
            } else if (num == el2) {
                ct2++;
            } else if (ct1 == 0) {
                el1 = num;
                ct1 = 1;
            } else if (ct2 == 0) {
                el2 = num;
                ct2 = 1;
            } else {
                ct1--;
                ct2--;
            }
        }
        
        // Pass 2: Verify candidates
        ct1 = 0;
        ct2 = 0;
        
        for (int i = 0; i < n; i++) {
            if (el1 == nums[i]) ct1++;
            if (el2 == nums[i]) ct2++;
        }
        
        if (ct1 > threshold) result.add(el1);
        if (ct2 > threshold) result.add(el2);
        
        return result;
    }
}