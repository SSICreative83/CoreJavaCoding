/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reflection;

import java.lang.reflect.Method;

/**
 *
 * @author huijun
 */
public class HelloWorld {
    private int a() {
        return 0;
    }
    private String test(int a, String a1) throws Exception{
        return "";
    }
    public static void main(String[] args) throws ClassNotFoundException{
        Class c = Class.forName("Reflection.HelloWorld");       //Class is in lang package
        System.out.println(c.isInstance(Integer.class));
        System.out.println(c.isInstance(new HelloWorld()));
        
        Method ms[] = c.getDeclaredMethods();   //similar for method/constructor/field
    
        for(Method m : ms){
            System.out.println(m.getModifiers() + "," + m.getReturnType() + "," + m.getName());
            Class ps[] = m.getParameterTypes();
            for(Class p : ps){
                System.out.println("type = " + p.getName());
            }
            Class es[] = m.getExceptionTypes();
            for(Class e : es){
                System.out.println("eeee" + e.getName());
            }
            System.out.println("==========");
        }
    }
}
