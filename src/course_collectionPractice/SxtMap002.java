/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_collection;

import java.util.LinkedList;

/**
 *
 * @author huijun
 */
public class SxtMap002 {
    public final static int CAPACITY = 32;
    LinkedList[] arr = new LinkedList[CAPACITY];
    int size;
    
    public void put(Object key, Object value) {
        SxtEntry e = new SxtEntry(key, value);
        int hash = key.hashCode();
        hash = hash < 0 ? -hash : hash;
        int a = hash % CAPACITY;
        if(arr[a] == null){
            LinkedList list = new LinkedList();
            arr[a] = list;
            list.add(e);
        }else{
            LinkedList list = arr[a];
            for(int i = 0; i < list.size(); i++){
                SxtEntry e2 = (SxtEntry)list.get(i);
                if(e2.key.equals(key)){
                    e2.value = value;   //duplicate key, overwrite
                    return;
                }
            }
            arr[a].add(e);
        }      
    }
    
    public Object get(Object key) {
        int a = key.hashCode() % CAPACITY;
        if(arr[a].size() < 2){
            return arr[a];
        }else{
            LinkedList list = arr[a];
            for(int i = 0; i < list.size(); i++){
                SxtEntry e = (SxtEntry)list.get(i);
                if(e.key.equals(key)){
                    return e.value;
                }
            }
        }   
        return null;
    }
    
    public boolean containsKey(Object key){
  
        return false;
    }
    
    public boolean containsValue(Object value){
       
        return false;
    }
    
    public static void main(String[] args){
        SxtMap002 map = new SxtMap002();
        map.put(1, "1");
        map.put(2, 2);
        System.out.println();
    }
}

