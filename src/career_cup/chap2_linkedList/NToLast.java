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
public class NToLast {
    public static MyNode nToLast(MyNode head, int n){
        if(n < 2)
            return head;
        
        MyNode index = head;
        MyNode index2 = head;
        for(int i = 0; i < n; i++){
            if(index2.next != null)
                index2 = index2.next;
            else
                return null; //list doen't have n nodes
        }
        while(index2.next != null){
            index = index.next;
            index2 = index2.next;
        }
        return index;
           
    }
    
}
