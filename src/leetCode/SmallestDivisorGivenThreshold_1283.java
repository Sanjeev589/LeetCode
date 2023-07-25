package leetCode;

public class SmallestDivisorGivenThreshold_1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        int high = Integer.MIN_VALUE;
        for(int i : nums)
            high = Math.max(high, i);
        int low =1;
        while(low <= high){
            int mid = (low+high)/2 ;
            if(getSum(nums, mid) <= threshold)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
    public int getSum(int[] nums, int div){
        int sum = 0;
        for(int i : nums)
            sum+= Math.ceil((double)i/(double)div);

        return sum;
    }
}
