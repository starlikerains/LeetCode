package fundation;

import java.util.*;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> maptable=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
        	if(maptable.containsKey(target-nums[i])) {
        		return  new int[]{maptable.get(target-nums[i]),i};
        	}
        	maptable.put(nums[i], i);
        }
        return new int[0];
    }
}

public class LeetCode1 {

}
