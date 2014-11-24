/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap4_TreeGraph;

/**
 *
 * @author huijun
 */
public class MyTreeNode {
    int data;
    MyTreeNode left;
    MyTreeNode right;
    
    public MyTreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;           
    }
}
