/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

import java.util.WeakHashMap;

/**
 *
 * @author huijun
 */
public class WeakHashMapTest {
    public static void main(String[] args) {
        
        WeakHashMap<String, String> map = new WeakHashMap<>();
        
        map.put("a", "a");
        map.put(new String("b"), "b");
        
        System.gc();
        System.runFinalization();
        
        System.out.println(map.size());
    }
}
