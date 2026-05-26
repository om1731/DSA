class Solution {
    boolean allcapital(String word){
        for(char ch:word.toCharArray()){
            if(ch<'A'|| ch>'Z')
                return false;
            }
            return true;
        }
    
    boolean allsmall(String word){
        for(char ch:word.toCharArray()){
            if(ch<'a'|| ch>'z')
                return false;
            }
            return true;
        }
    public boolean detectCapitalUse(String word) {
        if(allcapital(word)|| allsmall(word)|| allsmall(word.substring(1))){
            return true;
        }
        return false;
    }
}