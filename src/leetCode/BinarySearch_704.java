package leetCode;

public class BinarySearch_704 {

    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        //<= for condtion of 1element in nums
        while(low<=high){
            int mid = (high+low)/2 ;
            if(nums[mid] == target)
                return mid;
            else if( nums[mid] >target)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
