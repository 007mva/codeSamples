/*
Given an array of intervals intervals where intervals[i] = [starti, endi], 
return the minimum number of intervals 
you need to remove to make the rest of the intervals non-overlapping.

*/

 public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
    int remove=0;
    for(int i=1;i<intervals.length;i++){
        if(intervals[i-1][1]>intervals[i][0]){
                remove++;
                intervals[i][1]=Math.min(intervals[i-1][1],intervals[i][1]);
        }
    }
        return remove;
    }