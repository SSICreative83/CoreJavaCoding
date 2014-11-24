/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap4_TreeGraph;

import java.util.ArrayList;

/**
 *
 * @author huijun
 */
public class MyGraph {
    
    ArrayList<MyGraphNode> graph;

    public MyGraph(ArrayList<MyGraphNode> graph) {
        this.graph = graph;
    }
    
    
    public int V(){
        return graph.size();
    }
    
    public ArrayList<Integer> adj(int v){
        boolean found = false;
        MyGraphNode foundNode = null;
        for(MyGraphNode node : this.graph){
            if(node.id == v){
                found = true;
                foundNode = node;
                break;
            }
        }
        if(found)
            return foundNode.adjNodes;
        else return null;
    }
}
