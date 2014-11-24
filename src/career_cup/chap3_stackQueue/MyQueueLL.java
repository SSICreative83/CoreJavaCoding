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
public class MyQueueLL {
    int size;
    MyNode queueHead;
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int getLength(){
        return size;
    }
    
    public void enQueue(MyNode toPush){
        if(queueHead == null){  //first element
            queueHead = toPush;
        }else{
            MyNode currentNode = queueHead;
            while(currentNode.getNext() != null){
                currentNode = currentNode.getNext();            
            }
            currentNode.setNext(toPush);    //push to tail
        }
        size++;
    }
    
    public MyNode deQueue(){
        if(size == 0){
            return null;
        }
        
        MyNode toPop = queueHead;
        queueHead = queueHead.getNext();    //pop from head
        size--;
        return toPop;
    }
}
