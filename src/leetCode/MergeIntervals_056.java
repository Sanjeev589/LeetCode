package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_056 {
    public int[][] merge(int[][] intervals) {

        // sort based on 1st value of each sub array
        Arrays.sort(intervals, (o1, o2)->o1[0]-o2[0]);

        List<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        int i=1;
        while(i<intervals.length){
            int s = intervals[i][0];
            int e = intervals[i][1];
            if(s<=end){
                end = Math.max(e, end);
            }else{
                ans.add(new int[]{start, end});
                start = s;
                end = e;
            }i++;
        }
        ans.add(new int[]{start, end});
        //convert list to array
        return ans.toArray(new int[0][]);
    }
}
