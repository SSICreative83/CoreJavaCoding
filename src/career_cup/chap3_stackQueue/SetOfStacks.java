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
public class SetOfStacks {

    static final int CAPACITY = 4;
    static final int MAXSTACKNUM = 4;
    int size;
    int currentStackNum = 0;    //starting from 0
    int currentSize = 0;
    MyNode[][] myStack = new MyNode[MAXSTACKNUM][CAPACITY];

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getLength() {
        return this.size;
    }

    public MyNode pop() {
        if (size == 0) {
            return null;
        }
        MyNode toPop = myStack[currentStackNum][currentSize - 1];
        myStack[currentStackNum][currentSize - 1] = null;
        currentSize--;
        if(currentSize == 0){
            currentStackNum--;
            currentSize = CAPACITY;
        }
        size--;
        return toPop;
    }

    public void push(MyNode toPush) {
        if (currentStackNum == MAXSTACKNUM - 1 && currentSize >= CAPACITY) //full
        {
            return;
        }

        if (currentSize == CAPACITY) { //use new stack
            currentStackNum++;
            currentSize = 0;
        }
        myStack[currentStackNum][currentSize] = toPush;
        currentSize++;
        size++;
    }

    public MyNode peek() {
        return myStack[currentStackNum][currentSize - 1];
    }

    public MyNode popAt(int stackNum) {
        if (size == 0 || stackNum > currentStackNum) {
            return null;
        }
        MyNode toPop;
        if (stackNum == currentStackNum) {
            toPop = myStack[currentStackNum][currentSize - 1];
            myStack[currentStackNum][currentSize - 1] = null;
            currentSize--;

        } else {
            toPop = myStack[stackNum][CAPACITY - 1];
            myStack[stackNum][CAPACITY - 1] = null;
        }
        size--;
        return toPop;
    }
}
