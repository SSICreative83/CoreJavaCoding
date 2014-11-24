/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

/**
 *
 * @author huijun
 */
public class Test2 {
    private int a = 1;
    public String s = "teststest";
    private Test2() {

    }
    private Test2(int a, String a1) throws Exception{

    }
    public int aaa(int a){
        return a;
    }
    public static void main(String[] args) throws ClassNotFoundException{
        Class c = Class.forName("Reflection.Test2");       //Class is in lang package
        
        Constructor cs[] = c.getDeclaredConstructors();
                        
        for(Constructor t : cs){
            System.out.println(t.getModifiers() + "," + t.getName());
            Class ps[] = t.getParameterTypes();
            for(Class p : ps){
                System.out.println("type = " + p.getName());
            }
            Class es[] = t.getExceptionTypes();
            for(Class e : es){
                System.out.println("eeee" + e.getName());
            }
            System.out.println("==========");
        }
        
        Field fs[] = c.getDeclaredFields();
        
        for(Field f : fs){
            System.out.println("t = " + f.getName());
        }
               
    }
}
