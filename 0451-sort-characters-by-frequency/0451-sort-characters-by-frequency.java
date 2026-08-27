class element implements Comparable<element>{
    char ch;
    int freq;
    public element (char ch,int freq){
        this.ch=ch;
        this.freq=freq;

    }
public int compareTo(element that){
    return that.freq-this.freq;
}
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>ans=new HashMap<>();
        for(char ch:s.toCharArray()){
            ans.put(ch,ans.getOrDefault(ch,0)+1);
        }
        PriorityQueue<element>pq=new PriorityQueue<>();
        for(Map.Entry<Character,Integer>entry:ans.entrySet()){
            element ele=new element(entry.getKey(),entry.getValue());
            pq.offer(ele);
        }
        StringBuilder str=new StringBuilder();
        while(pq.size()>0){
            element ele=pq.poll();
            while(ele.freq>0){
                str.append(ele.ch);
                ele.freq--;
            }  
        }
        return str.toString();      
    }
}