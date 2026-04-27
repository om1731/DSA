class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int first = 1;                       
        int last = getMax(piles);             
        int result = last;

        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (canFinish(piles, mid, h)) {
                result = mid;                 
                last = mid - 1;             
            } else {
                first = mid + 1;             
            }
        }

        return result;
    }

 
    private boolean canFinish(int[] piles, int k, int h) {
        long totalHours = 0;

        for (int pile : piles) {
            totalHours += (pile + k - 1) / k;  
        }

        return totalHours <= h;
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}