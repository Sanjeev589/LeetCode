package leetCode;

public class KthMissingNumber_1539 {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length -1;
        while(low<= high){
            int mid = (low + high)/2;
            int missingVal = arr[mid] - (mid+1);
            if(missingVal < k)
                low = mid+1;
            else
                high = mid -1;
        }
        return k+high+1;
    }
}
