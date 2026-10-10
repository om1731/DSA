class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0){
            return 0;

        }
        Arrays.sort(intervals,(first,second)->Integer.compare(first[1],second[1]));
        int removecount=0;
        int lastendtime=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<lastendtime){
                removecount++;
            }else{
                lastendtime=intervals[i][1];
            }
        }
        return removecount;
    }
}