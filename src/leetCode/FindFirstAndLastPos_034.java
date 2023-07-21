package leetCode;

public class FindFirstAndLastPos_034 {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurance(nums, target);
        int[] ans = new int[2];
        if(first == -1){
            ans[0] = -1 ;
            ans[1] = -1 ;
        }else {
            int second = secondOccurance(nums, target);
            ans[0] = first;
            ans[1] = second;
        }
        return ans;
    }

    public int firstOccurance(int[] nums, int target){
        int first =-1, low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2 ;
            if(nums[mid] == target){
                first = mid;
                high = mid-1;
            }else if(nums[mid] > target)
                high = mid-1;
            else
                low = mid +1;
        }
        return first;
    }

    public int secondOccurance(int[] nums, int target){
        int second =-1, low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2 ;
            if(nums[mid] == target){
                second = mid;
                low = mid+1;
            }else if(nums[mid] > target)
                high = mid-1;
            else
                low = mid +1;
        }
        return second;
    }
}
