class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
        int[] A = nums1, B = nums2;
        if (A.length > B.length) {
            int[] temp = A; A = B; B = temp;
        }

        int m = A.length, n = B.length;
        int lo = 0, hi = m;

        while (lo <= hi) {
            int partA = (lo + hi) / 2;
            int partB = (m + n + 1) / 2 - partA;

            int maxLeftA  = (partA == 0) ? Integer.MIN_VALUE : A[partA - 1];
            int minRightA = (partA == m) ? Integer.MAX_VALUE : A[partA];

            int maxLeftB  = (partB == 0) ? Integer.MIN_VALUE : B[partB - 1];
            int minRightB = (partB == n) ? Integer.MAX_VALUE : B[partB];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeftA, maxLeftB);
                } else {
                    return (Math.max(maxLeftA, maxLeftB) 
                          + Math.min(minRightA, minRightB)) / 2.0;
                }
            } else if (maxLeftA > minRightB) {
                hi = partA - 1; 
            } else {
                lo = partA + 1;  
            }
        }

        return 0.0; 
    }
}