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
class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> OrderLevel = new LinkedList<List<Integer>>();
    	if(root==null)return OrderLevel;
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
    	queue.offer(root);
    	while(!queue.isEmpty()) {
    		List<Integer> Level = new ArrayList<Integer>();
    		int size=queue.size();    		
    		while(size--!=0) {
    			TreeNode t=queue.poll();
    			Level.add(t.val);
    			if(t.left!=null)queue.offer(t.left);
    			if(t.right!=null)queue.offer(t.right);
    		}
    		OrderLevel.add(0, Level);
    	}
    	return OrderLevel;
    }
}

public class LeetCode107 {

}
