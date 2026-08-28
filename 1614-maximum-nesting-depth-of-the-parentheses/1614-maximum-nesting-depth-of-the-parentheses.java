class Solution {
    public int maxDepth(String s) {
        int maxopen=0;
        int curropen=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                curropen++;
            }
            else if(s.charAt(i)==')'){
                curropen--;
            }
            maxopen=Math.max(maxopen,curropen);
            }
            
        
        return maxopen;
    }
}