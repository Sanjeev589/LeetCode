package leetCode;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2_229 {
    public List<Integer> majorityElement(int[] nums) {

        int count1 =0, count2 =0;
        int ele1=Integer.MIN_VALUE, ele2= Integer.MIN_VALUE;
        for(int i =0;i<nums.length ; i++){
            if(count1 == 0 && ele2 != nums[i]){
                ele1 = nums[i];
                count1 =1;
            }
            else if(count2 == 0 && ele1 != nums[i]){
                ele2 = nums[i];
                count2 =1;
            }
            else if(ele1 == nums[i])
                count1++;
            else if(ele2 == nums[i])
                count2++;
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int e1Count =0, e2Count =0;
        for(int i=0; i<nums.length; i++){
            if(ele1 ==nums[i])
                e1Count++;
            if(ele2 == nums[i])
                e2Count++;
        }
        if(e1Count > nums.length/3)
            ans.add(ele1);
        if(e2Count > nums.length/3)
            ans.add(ele2);
        return ans;
    }


}
