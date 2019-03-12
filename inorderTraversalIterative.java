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
    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        if(root == null){
            return inOrder;
        }
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);
        ArrayList<TreeNode> visited = new ArrayList<>(); 
        TreeNode temp;
        while(!nodes.empty()){
            temp = nodes.peek();
                if(temp.left != null && visited.indexOf(temp.left) == -1){
                    nodes.push(temp.left);
                }else{
                    temp = nodes.pop();
                    visited.add(temp);
                    inOrder.add(temp.val);
                    if(temp.right != null) { nodes.push(temp.right); }
                }
        }
        return inOrder;
    }
}
