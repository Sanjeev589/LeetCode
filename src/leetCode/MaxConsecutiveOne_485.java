package leetCode;
/*Given a binary array nums, return the maximum number of consecutive 1's in the array.

 */
public class MaxConsecutiveOne_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0, maxCount =0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==1)
                count++;
            else{
                if(maxCount<count)
                    maxCount =count;
                count =0;
            }
        }
        if(maxCount<count)
            maxCount =count;
        return maxCount;
    }
}
