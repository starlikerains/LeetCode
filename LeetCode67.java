package fundation;

class Solution67 {
    public String addBinary(String a, String b) {
        StringBuffer ans=new StringBuffer();
    	int mod=0;
    	int i=0;
    	for(;i<a.length()&&i<b.length();i++) {
    		int numa=a.charAt(a.length()-1-i)-'0';
    		int numb=b.charAt(b.length()-1-i)-'0';
    		ans.append((numa+numb+mod)%2);
    		mod=(numa+numb+mod)/2;
    	}
    	for(;i<a.length();i++) {
    		int numa=a.charAt(a.length()-1-i)-'0';
    		ans.append((numa+mod)%2);
    		mod=(numa+mod)/2;
    	}
    	for(;i<b.length();i++) {
    		int numb=b.charAt(b.length()-1-i)-'0';
    		ans.append((numb+mod)%2);
    		mod=(numb+mod)/2;
    	}
    	if(mod==1)ans.append('1');
    	return ans.reverse().toString();
    }
}

public class LeetCode67 {

}
