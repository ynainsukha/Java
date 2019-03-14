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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder == null){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode node;
        for(int i = 1; i < preorder.length; i++){
            node = root;
            for(int j = 0; j < i; j++){
                if(node.val > preorder[i]){
                    if(node.left == null){
                        node.left = new TreeNode(preorder[i]);
                        break;
                    }else{
                        node = node.left;
                    }
                }else{
                    if(node.right == null){
                        node.right = new TreeNode(preorder[i]);
                        break;
                    }else{
                        node = node.right;
                    }
                }
            }
        }
        return root;
    }
}
