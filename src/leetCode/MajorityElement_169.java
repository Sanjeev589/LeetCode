package leetCode;
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        int count =0, element =0;
        for(int i=0;i<nums.length; i++){
            if(count ==0){
                count =1;
                element = nums[i];
            }else if(element == nums[i])
                count++;
            else
                count--;
        }

        //In case if there are no majortiy element then only do below
        int count1 =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element)
                count1++;
        }
        if(count1>nums.length/2)
            return element;
        return -1;

    }

}
