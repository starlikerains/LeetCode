package fundation;

class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
    	String ans=strs[0];
    	for(String str:strs) {
    		for(int i = 0;i<str.length()&&i<ans.length();i++) {
    			if(str.charAt(i)!=ans.charAt(i)) {
    				ans=str.substring(0, i);
    				break;
    			}
    		}
    		if(ans.length()>str.length())ans=str;
    		if(ans=="")
    			break;
    	}
    	return ans;
    }
}

public class LeetCode14 {

}
