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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();
        if(root == null){
            return preOrder;
        }
        preOrder.add(root.val);
        nodes.push(root.right);
        nodes.push(root.left);
        TreeNode temp;
        while(!nodes.empty()){
            temp = nodes.pop();
            if(temp != null){
                preOrder.add(temp.val);
                nodes.push(temp.right);
                nodes.push(temp.left);
            }
        }
        return preOrder;
    }
}
