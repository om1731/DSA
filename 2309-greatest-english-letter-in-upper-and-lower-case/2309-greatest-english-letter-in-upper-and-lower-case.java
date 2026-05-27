class Solution {
    public String greatestLetter(String s) {
        TreeMap<String,Integer>map=new TreeMap<>();
        for(int i=0;i<s.length()-1;i++){
            String c=s.substring(i,i+1);
            char k=c.charAt(0);
            if(Character.isUpperCase(k)){
                if(s.contains(c.toLowerCase())){
                    map.put(c,c.charAt(0)-'A');
                }
            }
            if(Character.isLowerCase(k)){
                if(s.contains(c.toUpperCase())){
                    map.put(c.toUpperCase(),c.charAt(0)-'A');
                }
            }
        }
        System.out.println(map);
        if(!map.isEmpty()){
            return map.lastKey();

        }
        return "";
    }
}