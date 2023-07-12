package leetCode;

import java.util.HashSet;

/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
 */
public class LongestConsecutiveSequence_128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> setNums = new HashSet<>();
        for(int num: nums)
            setNums.add(num);
        int ans = 0;
        for(int num: nums){
            int currentNum =0, currentStreak =0 ;
            if(!setNums.contains(num-1)){
                currentNum = num;
                currentStreak +=1;
                while(setNums.contains(currentNum+1)){
                    currentNum +=1;
                    currentStreak +=1;
                }
                ans = Math.max(ans, currentStreak);
            }
        }
        return ans ;
    }
}

/*
TC = O(n)
SC =O(n)
 */