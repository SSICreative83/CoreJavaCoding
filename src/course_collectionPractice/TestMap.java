/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author huijun
 */
public class TestMap {
    public static void main(String[] args){
        Map map = new HashMap();
        map.put(1, new Wife("woman1"));
        map.put(2, new Wife("woman2"));
        Map map2 = new HashMap();
        map2.put(1, new Wife("woman3"));
        map2.put(4, new Wife("woman4"));
        
        Wife w = (Wife)map.get(2); //key, value are objects
        map.remove(0); //remove key-value pair, not delete
        map.containsKey(2);
        map.containsValue("test");
        System.out.println(map2.size());
        map.putAll(map2);
        System.out.println(map.size());
    }
}

class Wife{
    String name;
    public Wife(String name){
        this.name = name;
    }
}