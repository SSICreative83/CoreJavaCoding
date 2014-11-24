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
public class MyGraphNode {
    
    int id;
    boolean visited;
    ArrayList<Integer> adjNodes;

    public MyGraphNode(int id, ArrayList<Integer> adjNodes){
        this.id = id;
        this.adjNodes = adjNodes;
        this.visited = false;
    }

}
