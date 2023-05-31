public class NextPermutation_31 {

    public void nextPermutation(int[] nums) {
        int breakPoint = -1;
        int swapIndx = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakPoint = i;
                break;
            }
        }
        // already in last permutation
        if (breakPoint == -1)
            reverse(nums, 0);
        else {

            // already checked in 1st loop if all decending order, so 1st element greater than breakpoint is the min greatest val
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[breakPoint]) {
                    swapIndx = i;
                    break;
                }
            }
            swap(nums, breakPoint, swapIndx);
            reverse(nums, breakPoint + 1);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

}