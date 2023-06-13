package leetCode;
/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */
public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int sum =0, n =nums.length;
        for(int i=0;i<nums.length; i++)
            sum+=nums[i];
        int tsum = n*(n+1)/2;
        return tsum-sum;
    }
}
