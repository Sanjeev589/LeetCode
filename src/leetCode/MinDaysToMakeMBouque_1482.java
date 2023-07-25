package leetCode;

public class MinDaysToMakeMBouque_1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long)m*k) return -1;
        int max = 0, min = Integer.MAX_VALUE;
        for(int day:bloomDay){
            max = Math.max(max, day);
            min = Math.min(min, day);
        }
        int start = min, end = max;
        while(start<end){
            int mid = start+(end-start)/2;
            int bouquet = computeDays(bloomDay, k, mid);
            if(bouquet<m){
                start = mid+1;
            }
            else end = mid;
        }
        return start;
    }
    private int computeDays(int[] bloomDay, int k, int day){
        int b = 0;
        int currFlower = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>day){
                currFlower = 0;
            }
            else{
                currFlower++;
                if(currFlower>=k){
                    currFlower = 0;
                    b++;
                }
            }
        }
        return b;
    }
}
