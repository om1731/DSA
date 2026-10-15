class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>brackets=new Stack<>();
        Stack<Integer>aestrick=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                brackets.push(i);
        }
        else if(ch=='*'){
            aestrick.push(i);
        }
        else{
            if(!brackets.isEmpty()){
                brackets.pop();
            }
            else if(!aestrick.isEmpty()){
                aestrick.pop();
            }
            else {return false;}
        }
        }
        while(!brackets.isEmpty()){
            if(aestrick.isEmpty()){
            return false;}
            if(brackets.pop()>aestrick.pop()){
                return false;
            }
        }
        return brackets.isEmpty();
    }
}