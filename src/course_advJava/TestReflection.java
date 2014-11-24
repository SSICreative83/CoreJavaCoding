/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_advancedJava;

import java.lang.reflect.Constructor;

/**
 *
 * @author huijun
 */
public class TestReflection {
    public static void main(String[] args) throws Exception{
        Constructor cons = String.class.getConstructor(StringBuffer.class);
        String str2 = (String)cons.newInstance(new StringBuffer("abc"));
        System.out.println(str2.charAt(2));
    }
}
