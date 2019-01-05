/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author Yash Nainsukha
 */
import java.util.LinkedList;

public class JavaHelper {

    /**
     * @param string the input string
     * @return number of sub-string if string can be divided into equal sub-strings 
     */
    public static int get(String string){
        String sequence = "";
        int ans = 0;
        for(int i = 0; i<string.length()/2; i++) {
            sequence = sequence + string.charAt(i);
            if (string.matches("("+sequence+")*")) {
                ans = string.length()/sequence.length();
                break;
            }
        }
        return ans;
    }   
    
    
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

