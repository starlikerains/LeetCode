package fundation;

class Solution70 {
    public int climbStairs(int n) {
        if(n==1)return 1;
    	if(n==2)return 2;
    	int a1=1;
    	int a2=2;
    	for(int i=3;i<=n;i++) {
    		int cnt=a2;
    		a2=a1+a2;
    		a1=cnt;
    	}
    	return a2;
    }
}

public class LeetCode70 {

}
