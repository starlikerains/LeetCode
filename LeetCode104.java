package fundation;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution104 {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
    	int len1=maxDepth(root.left);
    	int len2=maxDepth(root.right);
    	return (len1>len2?len1:len2)+1;
    }
}

public class LeetCode104 {

}
