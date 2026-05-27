class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character>s=new HashSet<>();
        for(char ch:word.toCharArray()){
            s.add(ch);

        }
    
    int ans =0;
    for(char ch='a';ch<='z';ch++){
        if(s.contains(ch) && s.contains((char)(ch-'a'+'A'))){
            ans++;
        }
    }
    return ans;
    }
}