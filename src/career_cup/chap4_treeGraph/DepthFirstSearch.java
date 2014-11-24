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
public class DepthFirstSearch {
    private boolean[] marked;    // marked[v] = is there an s-v path?
    private int count;           // number of vertices connected to s

    /**
     * Computes the vertices in graph <tt>G</tt> that are
     * connected to the source vertex <tt>s</tt>.
     * @param G the graph
     * @param s the source vertex
     */
    public DepthFirstSearch(MyGraph G, int s) {
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    // depth first search from v
    private void dfs(MyGraph G, int v) {
        count++;
        marked[v] = true;
        System.out.println("visited: " + v);
        for (int w : G.adj(v)) {
            System.out.println("current check: " + w);
            System.out.println("current status: " + marked[w]);
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }

    /**
     * Is there a path between the source vertex <tt>s</tt> and vertex <tt>v</tt>?
     * @param v the vertex
     * @return <tt>true</tt> if there is a path, <tt>false</tt> otherwise
     */
    public boolean marked(int v) {
        return marked[v];
    }

    /**
     * Returns the number of vertices connected to the source vertex <tt>s</tt>.
     * @return the number of vertices connected to the source vertex <tt>s</tt>
     */
    public int count() {
        return count;
    }

    /**
     * Unit tests the <tt>DepthFirstSearch</tt> data type.
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> adjNode0 = new ArrayList<>(); 
        adjNode0.add(1);
        MyGraphNode node0 = new MyGraphNode(0, adjNode0);
        
        ArrayList<Integer> adjNode1 = new ArrayList<>(); 
        adjNode1.add(0);
        adjNode1.add(2);
        MyGraphNode node1 = new MyGraphNode(1, adjNode1);
        
        ArrayList<Integer> adjNode2 = new ArrayList<>(); 
        adjNode2.add(1);
        MyGraphNode node2 = new MyGraphNode(2, adjNode2);
        
        ArrayList<MyGraphNode> graph = new ArrayList<>();
        graph.add(node0);
        graph.add(node1);
        graph.add(node2);
        
        MyGraph G = new MyGraph(graph);
        int s = 0;
        DepthFirstSearch search = new DepthFirstSearch(G, s);
        
//        for (int v = 0; v < G.V(); v++) {
//            if (search.marked(v))
//                System.out.println(v + " ");
//        }
//
//        if (search.count() != G.V()) System.out.println("NOT connected");
//        else                         System.out.println("connected");
//        
    }
}
