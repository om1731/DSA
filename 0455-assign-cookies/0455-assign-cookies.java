class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int left=0;
        int right=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(left<s.length && right<g.length){
            if(g[right]<=s[left]){
                right+=1;
            }
            left+=1;
        }
        return right;
    }
}