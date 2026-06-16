class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;

        int[] keep = new int[n];   // no deletion
        int[] delete = new int[n]; // one deletion used

        keep[0] = arr[0];
        delete[0] = 0;

        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            keep[i] = Math.max(arr[i], keep[i - 1] + arr[i]);

            delete[i] = Math.max(
                keep[i - 1],          // delete current element
                delete[i - 1] + arr[i] // deletion already used
            );

            ans = Math.max(ans, Math.max(keep[i], delete[i]));
        }

        return ans;
    }
}