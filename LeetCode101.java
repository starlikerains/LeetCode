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
class Solution101 {
    public boolean isSymmetric(TreeNode root) {
    	if(root==null)return true;
        return Symmetric(root.left,root.right);
    }
    
    boolean Symmetric(TreeNode a,TreeNode b) {
    	if(a==null&&b==null)return true;
    	else if(a==null||b==null)return false;
    	else if(a.val!=b.val)return false;
    	else return Symmetric(a.left,b.right)&&Symmetric(a.right,b.left);
    }
}

public class LeetCode101 {

}
