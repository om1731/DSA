class Solution {
    boolean detectCapitalUse(String word){
        int countcapital=0;
        for(char ch:word.toCharArray()){
            if(Character.isUpperCase(ch))
            countcapital++;
        }
        if(countcapital==0|| countcapital==word.length()|| (countcapital==1&& Character.isUpperCase(word.charAt(0))))
        return true;
        return false;
    }}
            