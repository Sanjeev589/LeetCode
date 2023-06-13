package leetCode;
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i] =temp;
                j++;
            }

        }
    }
}
