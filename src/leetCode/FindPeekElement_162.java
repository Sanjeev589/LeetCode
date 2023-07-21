package leetCode;

public class FindPeekElement_162 {
    public int findPeakElement(int[] nums) {

        int n = nums.length -1;
        if(n==0)
            return 0;
        else if(nums[0]>nums[1])
            return 0;
        else if(nums[n]>nums[n-1])
            return n;

        int low = 1, high = n-1;
        while(low <= high){
            int mid = (low+high)/2 ;
            if(nums[mid] > nums[mid-1] && nums[mid]> nums[mid+1])
                return mid;
            else if(nums[mid]> nums[mid-1])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}
