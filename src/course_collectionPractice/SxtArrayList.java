/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_collection;

/**
 *
 * @author huijun
 */
public class SxtArrayList {
    
    private Object[] elementData;
    private int size;
    
    public int size(){
        return size;
    }
    
    public SxtArrayList(){
        this(10);
    }
        
    public SxtArrayList(int initialCapacity){
        if(initialCapacity < 0){
            try {
                throw new Exception();
            } catch (Exception e){
                e.printStackTrace();;
            }                   
        }
        elementData = new Object[initialCapacity];
    }
    
    private void ensureCapacity(){
        if(size == elementData.length){
            Object[] newArray = new Object[size * 2 + 1];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
        }
    }
    
    
    public void add(Object obj){    
        ensureCapacity();               
        elementData[size++] = obj;
    }
    
    public void add(int index, Object obj){
        ensureCapacity();
        rangeCheck(index);
        elementData[index] = obj;
        size++;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public Object get(int index){
        rangeCheck(index);
        return elementData[index];
    }
    
    public Object set(int index, Object obj){
        rangeCheck(index);
        Object oldValue = get(index);
        elementData[index] = obj;
        return oldValue;
    }
    
    public void remove(int index){
       rangeCheck(index);
       System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
       elementData[--size] = null;
    }
    
    public void remove(Object obj){
        for(int i = 0; i < size; i++){
            if(obj.equals(get(i))){  //need to use equals
                remove(i);
                return;
            }
        }
    }
    
    private void rangeCheck(int index){
       if(index < 0 || index >= size){
            try {
                throw new Exception();
            } catch (Exception ex) {  
                 ex.printStackTrace();;
            }
        }        
    }
    
    public static void main(String[] args){
        SxtArrayList list = new SxtArrayList(3);
        list.add("000");
        list.add("111");
        list.add("222");
        list.add("333");
        System.out.println(list.size());        
        list.remove(0);
        System.out.println(list.size());
    }
}
