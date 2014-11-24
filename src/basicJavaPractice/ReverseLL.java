/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

/**
 *
 * @author huijun
 */
public class ReverseLL {
    
    //recursive
    public static ListNode reverseRecursive(ListNode head){
        if (head == null || head.next == null) return head;
        
        ListNode newHead = reverseRecursive(head.next);
        
        ListNode last = newHead;
        while(last.next != null ){
            
            last = last.next;
        }
        
        last.next = head;
        head.next = null;
        return newHead;
    }
    
    //iterative
    public static ListNode reverseIter(ListNode head){
        ListNode prev = null, next = null;
        if (head == null) return head;
        while (true) {
            next = head.next;   //set next
            head.next = prev;   //change pointer (head's next, pre)
            prev = head;
            if (next == null) return head;  //see next
            head = next;         //move head
        }
    } 
    
    //iterative2, avoid return in while loop
    public static ListNode reverseIter2(ListNode head){
        
        if (head == null) return head;
        ListNode prev = null, next = null, cur = head;
        
        while (cur != null) {
            next = cur.next;   //set next
            cur.next = prev;   //change pointer 
            prev = cur;           
            cur = next;         //move head
        }
        
        return prev;
    } 
    
    //iterative, reverse with dummy node
    public static ListNode reverseWithDummy(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode pre = dummy;
        ListNode cur = head.next;
        ListNode last = head;
        
        while(cur != null){
            last.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = last.next;
        }
        
        head = dummy.next;
        return head;
    }
    
        
    /**
     * Reverse a link list between pre and next exclusively
     * an example:
     * a linked list:
     * 0->1->2->3->4->5->6
     * |           |   
     * pre        next
     * after call pre = reverse(pre, next)
     * 
     * 0->3->2->1->4->5->6
     *          |  |
     *          pre next
     * @param pre 
     * @param next
     * @return the reversed list's last node, which is the precedence of parameter next
     */
    private static ListNode reverseByPreNext(ListNode pre, ListNode next){
        ListNode last = pre.next;   //where first will be doomed "last"
        ListNode cur = last.next;
        
        while(cur != next){
            last.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = last.next;
        }
        
        return last;    //return new 'pre'
    }
    

    public static void main(String[] args) { 
         ListNode head = new ListNode(1);
         ListNode node2 = new ListNode(2);
         ListNode node3 = new ListNode(3);
         head.next = node2;
         node2.next = node3;
         
         ListNode index = head;
         while(index != null){
             //System.out.println(index.val);
             index = index.next;
         }
         
         head = reverseIter2(head);
         index = head;
         while(index != null){
             System.out.println(index.val);
             index = index.next;
         }
         
     }
}
