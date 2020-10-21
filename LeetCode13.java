package fundation;

class Solution13 {
    int replace(char ch) {
		if(ch=='M')return 1000;
		if(ch=='D')return 500;
		if(ch=='C')return 100;
		if(ch=='L')return 50;
		if(ch=='X')return 10;
		if(ch=='V')return 5;
		if(ch=='I')return 1;
		else return 0;
	}
    public int romanToInt(String s) {
        int ans=0;
		for(int i=0;i<s.length();i++) {
			if(i+1<s.length()) {
				if(replace(s.charAt(i))<replace(s.charAt(i+1))){
					ans+=replace(s.charAt(i+1))-replace(s.charAt(i));
					i++;
				}else {
					ans+=replace(s.charAt(i));
				}
			}else {
				ans+=replace(s.charAt(i));
			}
		}
		return ans;
    }
}

public class LeetCode13 {

}
