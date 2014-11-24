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
public class DeleteMiddle {
    public static void deleteMiddle(MyNode middleNode){
        if(middleNode == null || middleNode.next == null)
            return;
        
        middleNode.data = middleNode.next.data;   
        middleNode.next = middleNode.next.next;         
    }    
}
