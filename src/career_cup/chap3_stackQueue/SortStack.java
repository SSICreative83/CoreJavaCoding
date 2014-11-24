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
public class SortStack {
    public static MyStackLL sortStack(MyStackLL oldStack){
        MyStackLL newStack = new MyStackLL();
        while(!oldStack.isEmpty()){
            MyNode tmp = oldStack.pop();
            while(!newStack.isEmpty() && newStack.peek().getData() > tmp.getData()){
                oldStack.push(newStack.pop());
            }
            newStack.push(tmp);
        }
        return newStack;
    }
}
