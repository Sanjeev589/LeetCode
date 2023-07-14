package leetCode;

public class MaximumProductSubArray_152 {
    public int maxProduct(int[] nums) {
        int prefix =1, sufix =1, max =Integer.MIN_VALUE ;
        for(int i=0; i<nums.length; i++){
            if(prefix == 0)
                prefix =1;
            if(sufix == 0)
                sufix =1;
            prefix *= nums[i];
            sufix *= nums[nums.length-i-1];
            max = Math.max(max, Math.max(prefix, sufix));
        }

        return max;
    }
}
