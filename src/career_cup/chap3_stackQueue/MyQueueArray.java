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
public class MyQueueArray {
    static final int CAPACITY = 32;
    MyNode[] myQueue = new MyNode[CAPACITY];
    int size;
    
    public MyQueueArray(MyNode[] queueElements){
        for(int i = 0; i < queueElements.length; i++){
            this.enQueue(queueElements[i]);
        }
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int getLength(){
        return this.size;
    }
    
    public void enQueue(MyNode toPush){
        if(size >= CAPACITY) return;
        myQueue[size] = toPush;
        size++;
    }
    
    public MyNode deQueue(){
        MyNode toPop = myQueue[0];
        for(int i = 0; i < size - 1; i++){
            myQueue[i] = myQueue[i + 1];
        }
        size--;
        return toPop;
    }
}
