/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

import java.lang.ref.WeakReference;

/**
 *
 * @author huijun
 */
public class ReferenceTypes {
    public static void main(String[] args) {
        //string constant pool, strong reference
        String str = "bjsxt is very good.";
        
        //weak reference manage object
        WeakReference<String> wr = new WeakReference<>(str);      
        System.out.println("in gc:" + wr.get());
        
        //break reference
        str = null;
        
        //inform gc
        System.gc();
        System.runFinalization();
        System.out.println("after gc:" + wr.get());
        
        
        //string object, weak reference
        String str2 = new String("bjsxt is very good.");
        
        //weak reference manage object
        WeakReference<String> wr2 = new WeakReference<>(str2);      
        System.out.println("in gc:" + wr2.get());
        
        //break reference
        str2 = null;
        
        //inform gc
        System.gc();
        System.runFinalization();
        System.out.println("after gc:" + wr2.get());
    }
}
