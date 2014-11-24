/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course_collection;

/**
 *
 * @author huijun
 */
public class SxtLinkedList {

    private Node first;
    private Node last;
    private int size;

    public void add(Object obj) {
        Node n = new Node();
        if (first == null) {
            n.previous = null;
            n.obj = obj;
            n.next = null;

            first = n;
            last = n;
        } else {
            //add new node to last
            n.previous = first;
            n.obj = obj;
            n.next = null;

            last.next = n;
            last = n;
        }
        size++;
    }

    public void add(int index, Object obj) {
        //didn't implement
    }

    public int size() {
        return size;
    }

    private boolean rangeCheck(int index) {
        return index >= 0 && index < size;
    }

    public Object get(int index) {
        if (rangeCheck(index) && first != null) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.obj;
        } else {
            return null;
        }
    }

    public Node node(int index) {
        if (rangeCheck(index) && first != null) {
            Node temp = first;
            if (index < (size >> 1)) {
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
            } else {
                for (int i = size - 1; i > index; i--) {
                    temp = temp.previous;
                }
            }
            return temp;
        } else {
            return null;
        }
    }

    public void remove(int index) {
        if (rangeCheck(index) && first != null) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (size == 1) {
                first = null;
                last = null;
            } else if (temp == last) { //last node
                Node newLast = temp.previous;
                newLast.next = null;
                temp.previous = null;
                last = newLast;
            } else if (temp == first) {
                Node newFirst = temp.next;
                newFirst.previous = null;
                temp.next = null;
                first = newFirst;
            } else {
                temp.next.previous = temp.previous;
                temp.previous.next = temp.next;
            }
            size--;
        }
    }

    public static void main(String[] args) {
        SxtLinkedList list = new SxtLinkedList();
        list.add("aaa");
        System.out.println(list.get(0));
    }
}

class Node {

    Object obj;
    Node previous;
    Node next;

}
