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
public class MyLinkedList {

    public static boolean isEmpty(MyNode head) {
        return head == null;
    }

    public static int sizeOf(MyNode head) {
        if (!MyLinkedList.isEmpty(head)) {
            int i = 1;
            MyNode currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                i++;
            }
            return i;
        }
        return 0;
    }

    public static void insertNode(MyNode head, MyNode toInsert) {
        if (head == null) { //empty linked list
            head = toInsert;
        } else {
            MyNode currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = toInsert;
        }
        toInsert.next = null; //set tail pointer
    }

    public static void insertNodeToInt(MyNode head, MyNode toInsert, int insertPointData) {
        if (head == null) {
        } else if (head.data == insertPointData) {
            toInsert.next = new MyNode(head.data);
            head = toInsert;
        } else {
            MyNode currentNode = head;
            while (currentNode.next != null && currentNode.next.data != insertPointData) {
                currentNode = currentNode.next;
            }
            if (currentNode.next.data == insertPointData) {
                toInsert.next = currentNode.next;
                currentNode.next = toInsert;
            }
        }
    }

    public static MyNode deleteNode(MyNode head, MyNode toDelete) { //compare object, not data
        if (toDelete == null || head == null) {
        } else if (head == toDelete) {
            if (head.next == null) {
                head = null;
            } else {
                head = head.next;
            }
        } else {
            MyNode currentNode = head;
            while (currentNode.next != null && currentNode.next != toDelete) {
                currentNode = currentNode.next;
            }
            if (currentNode.next != null) {
                currentNode.next = toDelete.next;
            }
        }
        
        //System.out.println("head's data: " + head.data);
        return head;
    }

    public static MyNode searchNode(MyNode head, int searchPointData) { //what if multiple same data?
        if (head == null) {
        } else {
            MyNode currentNode = head;
            while (currentNode.next != null && currentNode.data != searchPointData) {
                currentNode = currentNode.next;
            }
            if (currentNode.data == searchPointData) {
                return currentNode;
            }
        }
        return new MyNode(-1); //-1 means doesn't exist
    }
}
