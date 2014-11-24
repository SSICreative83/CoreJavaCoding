/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap3_StackQueue;

/**
 *
 * @author huijun
 * @param <T>
 */
public class MyStackArray <T>{
    static final int CAPACITY = 32;
    T[] myStack;
    int size;

    public MyStackArray() {
        this.myStack = (T[]) new Object[CAPACITY];
    }
    
    public boolean isEmpty(){
        return this.size == 0;
    }
    
    public int getLength(){
        return this.size;
    }
    
    public T pop(){
        T toPop = myStack[size - 1];
        myStack[size - 1] = null;
        size--;
        return toPop;
    }
    
    public void push(T toPush){
        if(size >= CAPACITY) return;                   
        myStack[size] = toPush;
        size++;
    }
    
    public static void main(String[] args){
        MyStackArray<Integer> stack = new MyStackArray<>();
        stack.push(1);
        stack.push(3);
        System.out.println(stack.pop());
    }
}
