/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap3_StackQueue;

/**
 *
 * @author huijun
 */
public class MyNodeWithMin {
    int data;
    MyNode next;
    int minData;

    public MyNodeWithMin(int data, int minData) {
        this.data = data;
        this.minData = minData;
        this.next = null;
    }     
}
