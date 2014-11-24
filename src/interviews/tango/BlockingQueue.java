/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interview.Tango;

/**
 *
 * @author huijun
 */
import java.util.concurrent.ArrayBlockingQueue;
import java.util.*;

public class BlockingQueue {
    
    private Queue queue = new LinkedList();
    private int limit = 10;
    
    public BlockingQueue(int limit){
        this.limit = limit;
    }
    
     /**
     * Make a blocking Dequeue call so that we'll only return when the queue has
     * something on it, otherwise we'll wait until something is put on it.
     * 
     * @returns  This will return null if the thread wait() call is interrupted.
     */
    public synchronized Object dequeue() 
            throws InterruptedException {
               
        while (queue.isEmpty()) {
            wait();
        }
        
        if(this.queue.size() == this.limit){
            notifyAll();
        }
        
        return this.queue.remove();
    }
 
    /**
     * Enqueue will add an object to this queue, and will notify any waiting
     * threads that there is an object available.
     * @param item
     * @throws java.lang.InterruptedException
     */
    public synchronized void enqueue(Object item) 
            throws InterruptedException {
        
        while(this.queue.size() == this.limit){
            wait();
        }
        
        //notify all threads that are waiting
        if(this.queue.size() == 0){
            notifyAll();
        }
        
        this.queue.add(item);

    }   
    


    
    
    
}
