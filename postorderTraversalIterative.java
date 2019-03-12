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
    public List<Integer> postorderTraversalIterative(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        if(root == null){ return postOrder;}
        Stack<TreeNode> nodes = new Stack<>();
        ArrayList<TreeNode> visited = new ArrayList<>();
        nodes.push(root);
        TreeNode temp;
        while(!nodes.empty()){
            temp = nodes.peek();
            if(temp.left != null && visited.indexOf(temp.left) == -1){
                nodes.push(temp.left);
            }else if(temp.right != null && visited.indexOf(temp.right) == -1){
                nodes.push(temp.right);
            }else{
                temp = nodes.pop();
                postOrder.add(temp.val);
                visited.add(temp);
            }
        }
        return postOrder;
    }
}
