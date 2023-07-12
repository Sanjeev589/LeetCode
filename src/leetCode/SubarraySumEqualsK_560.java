package leetCode;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK_560 {
    public int subarraySum(int[] nums, int k) {
        int count =0, presum=0;
        Map<Integer, Integer> map = new HashMap<>();
        // presum =0, such record where presum =0 is 1.
        map.put(0,1);
        for(int i=0; i< nums.length; i++){
            //calculate presum 0 to i
            presum+= nums[i];
            // if there is a sum array with sum =k, then remaining will be presum-k
            int toRemove = presum -k;
            // increasing the count with no. of (presum-k)'s
            count += map.getOrDefault(toRemove, 0);
            // putting current presum as key and value will be 1, if there exisits more that 1such record so +1
            map.put(presum, map.getOrDefault(presum, 0) +1);
        }
        return count;
    }
}
