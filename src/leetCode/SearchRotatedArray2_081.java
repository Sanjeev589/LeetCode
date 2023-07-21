package leetCode;

public class SearchRotatedArray2_081 {
    public boolean search(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;

            if(target == nums[mid])
                return true;
            else if(nums[low] == nums[mid] && nums[mid]==nums[high])
            {
                low++;
                high--;
            }
            else if(nums[low] <= nums[mid]){
                if(target < nums[mid] && target >= nums[low])
                    high = mid-1;
                else
                    low = mid+1;
            }else{
                if(target > nums[mid] && target <= nums[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return false;
    }
}
