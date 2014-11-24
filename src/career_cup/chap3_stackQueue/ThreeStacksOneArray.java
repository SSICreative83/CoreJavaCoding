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
public class ThreeStacksOneArray {
    static final int CAPACITY = 32;
    MyNode[] threeStacks = new MyNode[3 * CAPACITY];
    int[] stacksSize = new int[3];
    int[] index = new int[3];
    
    public boolean isEmpty(int stackNum){
        return stacksSize[stackNum] == 0;
    }
    
    public int getLength(int stackNum){
        return stacksSize[stackNum];      
    }
    
    public void push(int stackNum, MyNode toPush){
        if(stacksSize[stackNum] >= CAPACITY){
            return;
        }
         
        threeStacks[index[stackNum]] = toPush;
        stacksSize[stackNum]++;
    }
    
    public MyNode pop(int stackNum){
        if(this.isEmpty(stackNum)){
            return null;
        }else{
            stacksSize[stackNum]--;
            return threeStacks[index[stackNum]];      //didn't clear data      
        }       
    }
    
    public MyNode peak(int stackNum){
        if(this.isEmpty(stackNum)){
            return null;
        }else{            
            return threeStacks[index[stackNum]];            
        } 
    } 
}
