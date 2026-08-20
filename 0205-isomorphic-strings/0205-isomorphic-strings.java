class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;

        }
        Map<Character,Character>charMappingMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original=s.charAt(i);
            char replace=t.charAt(i);
            if(!charMappingMap.containsKey(original)){
                if(!charMappingMap.containsValue(replace))
                charMappingMap.put(original,replace);
                else
                return false;
            }
            else{
                char mappedCharacter=charMappingMap.get(original);
                if(mappedCharacter!=replace)
                return false;}
            }
                return true;
            }
}