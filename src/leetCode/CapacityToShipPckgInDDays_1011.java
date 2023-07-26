package leetCode;

public class CapacityToShipPckgInDDays_1011 {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for(int i : weights){
            low = Math.max(low, i);
            high += i;
        }

        while(low<=high){
            int mid = (low+high)/2;
            if(getDays(weights, mid) <= days)
                high = mid -1;
            else
                low = mid +1;
        }
        return low;
    }

    public int getDays(int[] weights, int cap){
        int load =0, days =1;
        for(int i : weights){
            if((load + i ) > cap){
                days++;
                load = i;
            }else{
                load += i;
            }
        }
        return days;
    }
}
