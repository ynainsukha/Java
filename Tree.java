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
public class Tree {
     Tree left,right;
    String data;

    public Tree(Tree left, Tree right, String data){
        this.left = left;
        this.right = right;
        this.data = data;
    }
}
