package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums,int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length-3; i++){
            if(i>0 && (nums[i]==nums[i-1])) continue;
            for(int j=i+1; j<nums.length-2; j++){
                if(j>i+1 && (nums[j] == nums[j-1])) continue ;
                int low = j+1, high = nums.length-1;
                int reqVal = target-(nums[i]+nums[j]);
                while(low<high){
                    if(nums[low]+nums[high] == reqVal){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[low]);
                        temp.add(nums[high]);
                        ans.add(temp);

                        while(low<high && nums[low]==nums[low+1]) low++;
                        while(low<high && nums[high]==nums[high-1]) high--;
                        low++;
                        high--;

                    }
                    else if(nums[low]+nums[high] < reqVal)
                        low++;
                    else
                        high--;
                }
            }


        }
        return ans;
    }
}
