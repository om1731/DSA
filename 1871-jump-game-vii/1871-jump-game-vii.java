class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if (s.charAt(n - 1) == '1') return false;
        if (s.charAt(0) == '1') return false;  

        int[] pre = new int[n + 1];
        pre[0] = 0;
        pre[1] = 1; 

        for (int i = 1; i < n; i++) {
            int lo = Math.max(0, i - maxJump);
            int hi = i - minJump;

         
            pre[i + 1] = pre[i];

            if (hi < 0) continue;

            int reachableInWindow = pre[hi + 1] - pre[lo];

            if (s.charAt(i) == '0' && reachableInWindow > 0) {
                pre[i + 1] = pre[i] + 1;  
            }
        }

        return pre[n] > pre[n - 1];
    }
}