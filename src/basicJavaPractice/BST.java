/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

import java.util.ArrayList;

/**
 *
 * @author huijun
 */
public class BST {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; left = null; right = null; }
  }
    public ArrayList<TreeNode> generateTrees(int n) {
        ArrayList<TreeNode> result = new ArrayList<>();
        //if(n == 0)  return result;
        
        ArrayList<Integer> nodes = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            nodes.add(i);
        }
        
        TreeNode tmp = null;
        
        dfs(nodes, tmp, result);
        return result;
    }
    
    public void dfs(ArrayList<Integer> nodes, TreeNode tmp, ArrayList<TreeNode> result) {
        if(nodes.size() == 0){
            result.add(tmp);
            return;
        }
        
        for(int i = 0; i < nodes.size(); i++ ){
            int current = nodes.get(i);
            TreeNode ntmp = addNode(tmp, current);
            ArrayList<Integer> nnodes = new ArrayList<>(nodes);
            nnodes.remove(i);
            dfs(nnodes, ntmp, result);
        }
    }
    
    public TreeNode addNode(TreeNode tmp, int i){
        if(tmp == null){
            return new TreeNode(i);
        }
        TreeNode p = tmp;
        while(p != null){
            if(p.val > i){
                p = p.left;
            }else{
                p = p.right;
            }
        }
        p = new TreeNode(i);
        return tmp;
    }
    
    public static void main(String[] args){
        ArrayList<TreeNode> result = (new BST()).generateTrees(2);
       
        System.out.println(result.size());
        
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.remove(0);
        for(int i = 0; i < test.size(); i++){
            System.out.println(test.get(i));
        }
        
    }
}
