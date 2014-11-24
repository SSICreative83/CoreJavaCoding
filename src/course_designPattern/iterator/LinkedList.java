/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Iterator;
import Course_DesignPatterns.Iterator.Collection;
/**
 *
 * @author huijun
 */
public class LinkedList implements Collection{
    Node head = null;
    Node tail = null;
    int size;
    
    public void add(Object o){
        Node n = new Node(o, null);
        if(head == null){
            head = n;
            tail = n;
        }
        else{
            tail.setNext(n);
            tail = n;            
        }
        size++;
    }
    
    public int size(){
        return size;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
