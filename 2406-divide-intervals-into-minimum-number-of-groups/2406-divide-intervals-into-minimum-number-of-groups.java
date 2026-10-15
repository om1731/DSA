class Solution {
    public int minGroups(int[][] intervals) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=intervals.length;
        for(int i=0;i<n;i++){
            min=Math.min(min,intervals[i][0]);
            max=Math.max(max,intervals[i][1]);

        }
        int eventcount[]=new int[max+2];
        for(int i=0;i<n;i++){
            eventcount[intervals[i][0]]++;
            eventcount[intervals[i][1]+1]--;
        }
        int overlaps=0;
        int sum=0;
        for(int i=min;i<max+2;i++){
            sum+=eventcount[i];
            overlaps=Math.max(overlaps,sum);
        }
     return overlaps;  
    }
}