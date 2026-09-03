class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);

        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                if(freq.get(a)==freq.get(b)){
                    return b-a;

                }
                return freq.get(a)-freq.get(b);
            }
        });
        for(Integer key:freq.keySet()){
            pq.offer(key);}
            int i=0;
            while(!pq.isEmpty()){
                int key=pq.poll();
              int f=freq.get(key);
                for(int j=0;j<f;j++){
                    nums[i]=key;
                    i++;

                }
            }
            return nums;
          }
}
