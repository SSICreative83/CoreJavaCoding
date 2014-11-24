/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_collection;

import java.util.Objects;

/**
 *
 * @author huijun
 */
public class SxtMap001 {
    SxtEntry[] arr = new SxtEntry[32];
    int size;
    public void put(Object key, Object value) {
       SxtEntry e = new SxtEntry(key, value);
       for(int i = 0; i < size; i++){
           if(arr[i].key.equals(key)){
               arr[i].value = value;
               return;
           }
       }
        
        arr[size++] = new SxtEntry(key, value);
    }
    
    public Object get(Object key) {
        for(int i = 0; i < size; i++){
           if(arr[i].key.equals(key))
               return arr[i].value;
        }
        return null;
    }
    
    public boolean containsKey(Object key){
        for(int i = 0; i < size; i++){
           if(arr[i].key.equals(key))
               return true;
        }
        return false;
    }
    
    public boolean containsValue(Object value){
        for(int i = 0; i < size; i++){
           if(arr[i].value.equals(value))
               return true;
        }
        return false;
    }
    
    public static void main(){
        SxtMap001 map = new SxtMap001();
        map.put(1, "1");
        map.put(2, 2);
        System.out.println();
    }
}

class SxtEntry {
    Object key;
    Object value;
    
    public SxtEntry(Object key, Object value) {
        super();
        this.key = key;
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.key);
        hash = 53 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SxtEntry other = (SxtEntry) obj;
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        return true;
    }
}