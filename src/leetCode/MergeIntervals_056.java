package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

    //another approach
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length; // size of the array
        //sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans.get(ans.size() - 1).set(1,
                        Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        return ans;
    }
}
