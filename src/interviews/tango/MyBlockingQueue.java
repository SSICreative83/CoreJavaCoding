/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interview.Tango;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author huijun
 */
public class MyBlockingQueue<T> {
    
    private Queue<T> queue;
    private AtomicInteger limit = new AtomicInteger(10);
    private Lock put_lock = new ReentrantLock();
    private Lock take_lock = new ReentrantLock();
    
    public MyBlockingQueue(AtomicInteger limit){
        queue = new LinkedList<T>();
        this.limit = limit;
    }
    
    public boolean put(T item) throws InterruptedException{
        put_lock.lockInterruptibly();
        try{
            while(queue.size() == limit.get()){
                put_lock.newCondition().await();
            }
            put_lock.newCondition().signal();
            queue.add(item);
        }finally{
            put_lock.unlock();
        }
        
        return true;
    }
       public T take() throws InterruptedException{
        take_lock.lockInterruptibly();
        try{
            while(queue.size() == 0){
                take_lock.newCondition().await();
            }
            take_lock.newCondition().signal();
            return queue.poll();
        }finally {
            take_lock.unlock();
        }
    }
 
}
