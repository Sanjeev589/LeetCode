package leetCode;

//Given an array nums, return true if the array was originally sorted in non-decreasing order,
// then rotated some number of positions (including zero). Otherwise, return false.



//if sorted and rotated then it will break at only 1 place. if not rotated it wont break;
public class CheckArraySortedRotedOrNot_1752 {
    public boolean check(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >nums[(i+1)%nums.length])   // % size is to handle case such as [2,1,3,4]
                count++;
        }
        return count<=1;

    }
}
