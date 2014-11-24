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
public class ProblemsTests {
    public static void main(String[] args){
        MyNode head = new MyNode(1);
        MyNode toInsert = new MyNode(2);
        MyNode toInsert2 = new MyNode(3);
        MyNode toInsert3 = new MyNode(3);
        MyNode toInsert4 = new MyNode(4);
        MyNode toInsert5 = new MyNode(5);
        MyNode toInsert6 = new MyNode(6);
        
        MyNode head2 = new MyNode(3);
        MyNode head3 = new MyNode(5);
        MyNode toInsert7 = new MyNode(1);
        MyNode toInsert8 = new MyNode(5);
        MyNode toInsert9 = new MyNode(9);
        MyNode toInsert10 = new MyNode(2);
                
        //Linked list basic tests
        MyLinkedList.insertNode(head, toInsert);
        MyLinkedList.insertNode(head, toInsert2);
        MyLinkedList.insertNode(head, toInsert3);
        
        System.out.println(MyLinkedList.isEmpty(head));
        System.out.println(MyLinkedList.sizeOf(head));
        System.out.println("Search result:");   
        System.out.println(MyLinkedList.searchNode(head, 1).data);
        System.out.println("Data in linked list:");                
        //if no return value, the function call deleteNode will change the linked list
        //but will not change head (line15) automatically head's data: 2; linked list: 1, 2, 3
        head = MyLinkedList.deleteNode(head, head);   
        MyNode currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("End testing linked list");
         
        //P1
        head = RemoveDup.removeDupLocal(head);
        currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("End testing P1");
        
        MyLinkedList.insertNode(head, toInsert4);
        MyLinkedList.insertNode(head, toInsert5);
        MyLinkedList.insertNode(head, toInsert6);
        DeleteMiddle.deleteMiddle(toInsert4);
        currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("End testing P2");
        
        MyLinkedList.insertNode(head2, toInsert7);
        MyLinkedList.insertNode(head2, toInsert8);
        MyLinkedList.insertNode(head3, toInsert9);
        MyLinkedList.insertNode(head3, toInsert10);
        
        currentNode = SumTwoNumbers.sumTwoNumbers(head2, head3);
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("End testing P4");
        
    }
}
