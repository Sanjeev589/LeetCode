package leetCode;
/*
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
 */
public class RearrangeArrayElemBySign_2149 {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length] ;
        int evenIndex =0, oddIndex = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[oddIndex] = nums[i];
                oddIndex+=2;
            }else{
                ans[evenIndex] = nums[i];
                evenIndex +=2;
            }
        }
        return ans;
    }
}
