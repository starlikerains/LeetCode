package fundation;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        int viewer=0;
        for(int i=1;i<nums.length;i++) {
        	if(nums[i]!=nums[viewer]) {
        		++viewer;
        		nums[viewer]=nums[i];
        	}
        }
        int len=viewer+1;
        return len;
    }
}

public class LeetCode26 {

}
