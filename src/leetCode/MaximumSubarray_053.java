package leetCode;
/*
Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.

 Kadane’s Algorithm
 */
public class MaximumSubarray_053 {
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
