/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reflection;

import java.lang.reflect.*;

/**
 *
 * @author huijun
 */
public class Call {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Reflection.Test2");
        
        //Object t2 = c.newInstance();//If Test2 has a default costructor (no param)
        
        Class ps[] = new Class[2];
        ps[0] = Integer.TYPE; //or Integer.class
        ps[1] = String.class;
        
        Constructor cons = c.getConstructor(ps);    //no method??
        
        Object os[] = new Object[2];
        os[0] = 123;
        os[1] = "123";
        
        Object ob = cons.newInstance(os);
        
        Class ags[] = new Class[1];
        ags[0] = Integer.TYPE;
        
        Method m1 = c.getMethod("aaa", ags);
        
        Object mes[] = new Object[1];
        mes[0] = 454;
        
        Object retV = m1.invoke(ob, mes);
        System.out.println("retV==" + retV);
        
    }
}
