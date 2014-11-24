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
public class QueueTwoStack {
    MyStackLL s1, s2;    //CAN USE GENERIC???
    public QueueTwoStack(){
        s1 = new MyStackLL();
        s2 = new MyStackLL();
    }
    
    public int getLength(){
        return s1.getLength() + s2.getLength();
    }
    
    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
    
    public void add(MyNode toAdd){
        s1.push(toAdd);
    }
    
    public MyNode remove(){
        if(this.isEmpty()) return null;
                
        if(!s2.isEmpty()){
            return s2.pop();
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
    }

}
