class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>ans =new HashMap<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(!ans.containsKey(s.charAt(i))){
                q.add(i);
            }
            ans.put(s.charAt(i),ans.getOrDefault(s.charAt(i),0)+1);
            while(!q.isEmpty() && ans.get(s.charAt(q.peek()))>1){
            q.poll();
        }        
    }
return q.isEmpty()?-1:q.peek();
}
}