package leetCode;

public class KokoEatingBananas_875 {

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
            high = Math.max(high, piles[i]);

        while(low<=high){
            int mid = (low+high)/2;
            if(calculate(piles, mid) <= h)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;

    }

    public int calculate(int[] piles, int mid){
        int time =0;
        for(int i=0;i<piles.length;i++){
            time+= Math.ceil((double)piles[i]/(double)mid);
        }
        return time;
    }
}
