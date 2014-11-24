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
public class MyStackLL {
    int size;
    MyNode stackTop;
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int getLength(){
        return size;
    }
    
    public void push(MyNode toPush){
        if(stackTop == null){  //first element
            stackTop = toPush;
        }else{
            toPush.setNext(stackTop);
            stackTop = toPush;  //NEED TO SET NEW TOP
        }
        size++;
    }
    
    public MyNode pop(){
        if(size == 0){
            return null;
        }
        
        MyNode toPop = stackTop;
        stackTop = stackTop.getNext();
        size--;
        return toPop;
    }
    
    public MyNode peek(){
        if(size == 0){
            return null;
        }
        
        return stackTop;             
    }
}
