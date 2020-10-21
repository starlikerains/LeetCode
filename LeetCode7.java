package fundation;

class Solution7 {
    public int reverse(int x) {
        int ans=0;
    	while(x!=0) {
    		int pop = x%10;
    		if(ans>Integer.MAX_VALUE/10||(ans==Integer.MAX_VALUE/10&&pop>Integer.MAX_VALUE-Integer.MAX_VALUE/10))return 0;
    		if(ans<Integer.MIN_VALUE/10||(ans==Integer.MIN_VALUE/10&&pop<Integer.MIN_VALUE-Integer.MIN_VALUE/10))return 0;
    		ans=ans*10+pop;
    		x=x/10;
    	}
    	return ans;
    }
}


public class LeetCode7 {

}
