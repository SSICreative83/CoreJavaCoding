/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap2_LinkedList;

import java.util.ArrayList;

/**
 *
 * @author huijun
 */
public class RemoveDup {
    public static MyNode removeDup(MyNode head){
        ArrayList array = new ArrayList();
        MyNode currentNode = head;       
        array.add(head.data);
                        
        while(currentNode != null && currentNode.next != null){                     
            if(array.contains(currentNode.next.data))
            {
                head = MyLinkedList.deleteNode(head, currentNode.next);        //can update head? 
                
            }else{
                array.add(currentNode.next.data);
                currentNode = currentNode.next; 
            }
            
        }                      
        return head;
    } 
    
    public static MyNode removeDupLocal(MyNode head){       
        MyNode currentNode = head;       
                       
        while(currentNode != null && currentNode.next != null){    
            MyNode index = currentNode;
            while(index != null && index.next != null){
                if(currentNode.data == index.next.data)
                     head = MyLinkedList.deleteNode(head, index.next);
                else
                    index = index.next;
            }    
            currentNode = currentNode.next;
        }                      
        return head;
    } 
}
