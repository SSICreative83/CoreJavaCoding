/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_collection;

import java.util.HashMap;

/**
 *
 * @author huijun
 */
public class SxtHashSet {
    HashMap map;
    private static final Object PRESENT = new Object();
    
    public SxtHashSet(){
        map = new HashMap();
    }
    
    public int size(){
        return map.size();
    }
    
    public void add(Object o){
        map.put(o, PRESENT);    //no duplication. since key in map can't be duplicate        
    }
    
    public void remove(Object o){
        
    }
    
    public static void main(){
        SxtHashSet s = new SxtHashSet();
        s.add("aaa");               
    }
}
