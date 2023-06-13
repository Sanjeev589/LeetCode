package leetCode;



/*For Rotating Elements to right
        Step 1: Reverse the last k elements of the array

        Step 2: Reverse the first n-k elements of the array.

        Step 3: Reverse the whole array.

        For Eg , arr[]={1,2,3,4,5,6,7} , k=2*/
/*For Rotating Elements to left
        Step 1: Reverse the first k elements of the array

        Step 2: Reverse the last n-k elements of the array.

        Step 3: Reverse the whole array.

        For Eg , arr[]={1,2,3,4,5,6,7} , k=2*/
public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        if(nums.length > k)
            k = k%nums.length;
        reverse(nums, nums.length-k, nums.length -1);
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, 0, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
