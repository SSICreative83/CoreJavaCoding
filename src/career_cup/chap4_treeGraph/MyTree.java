/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CareerCup.Chap4_TreeGraph;

import java.util.Stack;

/**
 *
 * @author huijun
 */
public class MyTree {
    
    public static void easyInOrder(MyTreeNode root) {
        if (root != null) {
            if (root.left != null) {
                easyInOrder(root.left);
            }
            System.out.println(root.data);
            if (root.right != null) {
                easyInOrder(root.right);
            }
        }
    }
        
    public static void easyPreOrder(MyTreeNode root) {
        if (root != null) {
            System.out.println(root.data);            
            if (root.left != null) {
                easyPreOrder(root.left);
            }            
            if (root.right != null) {
                easyPreOrder(root.right);
            }
        }
    }
            
    public static void easyPostOrder(MyTreeNode root) {
        if (root != null) {
            if (root.left != null) {
                easyPostOrder(root.left);
            }           
            if (root.right != null) {
                easyPostOrder(root.right);
            }
            System.out.println(root.data);
        }
    }

    public static void inOrder(MyTreeNode root) {
        Stack<MyTreeNode> stack = new Stack<>();
        if(root == null)    return;
        MyTreeNode p = root;      
        
        while(!stack.isEmpty() || p != null){
            if(p != null){
                stack.push(p);
                p = p.left;
            }
            else{
                MyTreeNode current = stack.pop();
                System.out.println(current.data);
                p = current.right;
            }
        } 
    }

    public static void preOrder(MyTreeNode root) {
        Stack<MyTreeNode> stack = new Stack<>();
        if(root != null)    stack.push(root);
        
        while(!stack.isEmpty()){
            MyTreeNode current = stack.pop();
            System.out.println(current.data);
            if(current.right!= null) stack.push(current.right);
            if(current.left!= null) stack.push(current.left);         
        }               
    }

    public void postOrder(MyTreeNode root) {
//http://oj.leetcode.com/problems/binary-tree-postorder-traversal/
        
    }
    
    public static void main(String[] args){
        MyTreeNode node1 = new MyTreeNode(1);
        MyTreeNode node2 = new MyTreeNode(2);
        MyTreeNode node3 = new MyTreeNode(3);
        MyTreeNode node4 = new MyTreeNode(4);
        MyTreeNode node5 = new MyTreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        
        MyTree.inOrder(node1);
    }
}
