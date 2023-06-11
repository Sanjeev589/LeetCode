package leetCode;

public class SubArraySum_KadanesAlgo_53 {
    // not work for array having all -ve elements
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], curSum =0;
        for(int i=0;i<nums.length; i++){
            curSum = curSum + nums[i];
            if(curSum > maxSum)
                maxSum = curSum;
            if(curSum < 0)
                curSum =0;
        }
        return maxSum;
    }
}
