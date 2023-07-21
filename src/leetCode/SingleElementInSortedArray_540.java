package leetCode;

public class SingleElementInSortedArray_540 {
    public int singleNonDuplicate(int[] nums) {
        int n= nums.length-1;
        if(nums.length == 1)
            return nums[0];
        if(nums[0] != nums[1])
            return nums[0];
        if(nums[n-1] != nums[n])
            return nums[n];
        int low = 1, high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if((nums[mid]!=nums[mid+1]) && (nums[mid] != nums[mid-1]))
                return nums[mid];
            else if((mid%2==0 && nums[mid] == nums[mid+1]) ||
                    (mid%2==1 && nums[mid-1]==nums[mid]))
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}
