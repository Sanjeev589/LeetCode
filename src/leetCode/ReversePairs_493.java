package leetCode;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs_493 {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public int mergeSort(int[] nums, int low, int high){
        int count =0;
        if(low >= high)
            return count;
        int mid = (high+low)/2 ;
        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += countPair(nums, low, mid, high);
        merge(nums, low, mid, high);
        return count;
    }

    public void merge(int[] nums, int low, int mid, int high){
        int left =low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();
        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left]);
                left++ ;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }

        while(right<=high){
            temp.add(nums[right]);
            right++;
        }

        for(int i=low; i<=high; i++)
            nums[i] = temp.get(i-low);
    }

    public int countPair(int[] nums, int low, int mid, int high){
        int right =mid+1, count =0;
        for(int i=low; i<=mid ; i++){
            //imp to convert to long as test case contains big val
            while( right<=high && nums[i] > 2*(long)nums[right]) right++;
            count += right - (mid+1);
        }
        return count;
    }
}
