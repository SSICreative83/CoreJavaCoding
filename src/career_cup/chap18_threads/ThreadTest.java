/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap18_Threads;

/**
 *
 * @author huijun
 */
public class ThreadTest {
    static class MyThread implements Runnable{
        @Override
        public void run() {
            int i = 0;
            while(i < 10) {
                System.out.println(i++);
            }
        }            
    }
    
    public static void main(String[] args){
        MyThread foo = new MyThread();
        Thread myThread = new Thread(foo);
        myThread.start();
    }  
}
