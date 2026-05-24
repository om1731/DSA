class Solution {
    private int[] memo;
    
    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        memo = new int[n];
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, dp(arr, i, d));
        }
        return result;
    }
    
    private int dp(int[] arr, int i, int d) {
        if (memo[i] != 0) return memo[i];
        
        int best = 1;
        
     
        for (int j = i + 1; j <= Math.min(i + d, arr.length - 1); j++) {
            if (arr[j] >= arr[i]) break;
            best = Math.max(best, 1 + dp(arr, j, d));
        }
        
      
        for (int j = i - 1; j >= Math.max(i - d, 0); j--) {
            if (arr[j] >= arr[i]) break;
            best = Math.max(best, 1 + dp(arr, j, d));
        }
        
        memo[i] = best;
        return best;
    }
}