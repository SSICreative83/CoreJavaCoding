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
public class DetermineCircular {

    public static MyNode isCircular(MyNode head) {
        if(head == null){
            return null;
        }
        MyNode p1 = head;
        MyNode p2 = head;
        
        while (p1.next != null && p2.next != null && p2.next.next != null) {
            if (p1 == p2) {
                break;
            } else {
                p1 = p1.next;
                p2 = p2.next.next;
            }
        }
        if(p1 != p2)
            return null;
        else{
            p1 = head;
            while(p1 != p2){
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }                    
    }
}
