/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int treeMaxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int depth_left = 1, depth_right = 1; 
        if(root.left != null){ depth_left += treeMaxDepth(root.left); }
        if(root.right != null){ depth_right += treeMaxDepth(root.right); }
        return Math.max(depth_left,depth_right);
    }
}
