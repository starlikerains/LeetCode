package fundation;

class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int L=0,R=nums.length-1;
    	while(L<=R) {
    		int mid=(L+R)/2;
    		if(nums[mid]==target)return mid;
    		else if(nums[mid]<target)L=mid+1;
    		else R=mid-1;
    	}
    	return L;
    }
}

public class LeetCode35 {

}
