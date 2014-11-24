/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Iterator;
import Course_DesignPatterns.Iterator.Collection;
/**
 *
 * @author huijun
 */
public class ArrayList implements Collection{
    Object[] objects = new Object[10];  //original size
    int index = 0;  //next available position in array, size
    
    public void add(Object o){
        if(index == objects.length){
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }
    
    public int size(){
        return index;
    }
    
    public Iterator iterator(){
        return new ArrayListIterator();
    }
    
    private class ArrayListIterator implements Iterator {
        private int currentIndex = 0;
        
        @Override
        public Object next() {
             Object o = objects[currentIndex++];
             return o;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < index;
        }
        
    }
}
