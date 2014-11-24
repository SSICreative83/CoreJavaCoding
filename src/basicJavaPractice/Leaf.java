/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

/**
 *
 * @author huijun
 */
public class Leaf {
    
    public static int numLeaf(TreeNode root){
        if(root == null)    return 0;
        return dfs(root);
    }
    
    public static int dfs(TreeNode root){
        if(root.left == null && root.right == null){
            return 1;
        }
        
        int tmp = 0;
        
        if(root.left != null){
            tmp += dfs(root.left);
            
        }
        
        if(root.right != null){
            tmp += dfs(root.right);           
        }
        
        return tmp;
    }
    
    public static void main(String[] args){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);      
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);  
        TreeNode n7 = new TreeNode(7);
        
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        //n3.left = n6;
        //n3.right = n7;
        
        System.out.println(numLeaf(n1));
        
    }
    
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right; 
    
    public TreeNode(int val){
        this.val = val;
    }
}