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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelorder = new ArrayList<>();
        if(root == null){ return levelorder; }
        Queue<TreeNode> nodes = new ArrayDeque<TreeNode>();
        nodes.add(root);
        int currentLevelNode = 1,nextLevelNode = 0;
        List<Integer> visited = new ArrayList<>();
        TreeNode temp;
        while((temp=nodes.poll()) != null){
            visited.add(temp.val);
            --currentLevelNode;
            if(temp.left != null){ 
                nodes.add(temp.left); 
                ++nextLevelNode;
            }
            if(temp.right != null){ 
                nodes.add(temp.right); 
                ++nextLevelNode;
            }
            if(currentLevelNode == 0){
                currentLevelNode = nextLevelNode;
                nextLevelNode = 0;
                levelorder.add(visited);
                visited = new ArrayList<>();
            }
        }
        return levelorder;
    }
}
