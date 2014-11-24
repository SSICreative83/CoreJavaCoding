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
public class SumTwoNumbers {

    public static MyNode sumTwoNumbers(MyNode head1, MyNode head2) {
        MyNode head3 = new MyNode(0);
        MyNode p3 = head3;
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        } else {
            MyNode p1 = head1;
            MyNode p2 = head2;
            int borrow = 0;

            while (p1 != null && p2 != null || borrow != 0) {
                if (p1 == null) {
                    p3.next = new MyNode(borrow);

                    return head3;
                } else {

                    if (p1.data + p2.data + borrow < 10) {
                        p3.data = p1.data + p2.data + borrow;
                        borrow = 0;

                    } else {
                        p3.data = (p1.data + p2.data + borrow) % 10;
                        borrow = (p1.data + p2.data + borrow) / 10;

                    }
                    p1 = p1.next;
                    p2 = p2.next;
                    if (p1 != null || borrow != 0) {
                        p3.next = new MyNode(0);
                        p3 = p3.next;
                    }
                }

            }

        }
        return head3;
    }
}
