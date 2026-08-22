class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> res=new HashMap<>();
        res.put('I',1);
         res.put('V',5);
          res.put('X',10);
           res.put('L',50);
            res.put('C',100);
             res.put('D',500);
              res.put('M',1000);
        int result=res.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(res.get(s.charAt(i))<res.get(s.charAt(i+1))){
                result=result-res.get(s.charAt(i));
            }
            else{
                result=result+res.get(s.charAt(i));
            }
        }
    
    return result;
}}