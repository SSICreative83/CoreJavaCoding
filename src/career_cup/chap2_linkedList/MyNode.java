/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CareerCup.Chap2_LinkedList;

/**
 *
 * @author huijun
 */
public class MyNode {

    MyNode next;
    int data;

    public MyNode(int data) {
        this.data = data;
        this.next = null;
    }

    public MyNode getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

}
