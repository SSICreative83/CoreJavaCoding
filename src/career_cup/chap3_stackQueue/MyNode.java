/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap3_StackQueue;

/**
 *
 * @author huijun
 */
public class MyNode {
    private int data;
    private MyNode next;

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public MyNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(MyNode next) {
        this.next = next;
    }
    
    public MyNode(int data){
        this.data = data;
        this.next = null;               
    }
}
