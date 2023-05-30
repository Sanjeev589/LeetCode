public class SortColors_75 {
    public void sortColors(int[] nums) {
        int l=0, m=0, h=nums.length-1;
        while(m<=h){
            if(nums[m] == 0)
            {
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;
                l++;
                m++;
            }
            else if(nums[m] == 1)
                m++;
            else if(nums[m] == 2){
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
            }

        }
    }
}
