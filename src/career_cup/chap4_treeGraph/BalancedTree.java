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
public class BalancedTree {
    public static boolean isBalancedTree(MyTreeNode root){
        return (maxDepth(root) - minDepth(root) <= 1);
    }

    private static int maxDepth(MyTreeNode root) {
       if(root == null)
           return 0;
       else {
           return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
       }       
    }

    private static int minDepth(MyTreeNode root) {
       if(root == null)
           return 0;
       else {
           return 1 + Math.min(minDepth(root.left), minDepth(root.right));
       } 
    }
}
