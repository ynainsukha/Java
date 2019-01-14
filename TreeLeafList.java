package helper;

import java.util.LinkedList;

public class TreeLeafList{
    
    /**
     * @param root the Tree object() that contains the root node
     * @return list of leaf nodes of a tree from left to right
     */
    public static LinkedList leafList(Tree root){
        
        LinkedList<Tree> list = new LinkedList<>();
        list.add(root);
        int leaf_index = -1;
        while(leaf_index != (list.size()-1))
        {
            if(list.get(list.size()-1).left == null && list.get(list.size()-1).right == null){
                list.add(++leaf_index,list.get(list.size()-1));
                list.remove(list.size()-1);
            }else{
                Tree temp = list.get(list.size()-1);
                list.remove(list.size()-1);
                if(temp.right != null)
                {
                    list.add(temp.right);
                }
                if(temp.left != null)
                {
                    list.add(temp.left);
                }
            }
        }
        return list;
    }
}
