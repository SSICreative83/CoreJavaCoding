/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Iterator;

/**
 *
 * @author huijun
 */
public class GenericArrayList<E> {
    Object[] objects = new Object[10];  //original size
    int index = 0;  //next available position in array, size
    
    public void add(E o){
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
    
    public static void main(String[] args){
        GenericArrayList<String> a = new GenericArrayList<String>();
        a.add("aaa");//can only add String
    }
}
