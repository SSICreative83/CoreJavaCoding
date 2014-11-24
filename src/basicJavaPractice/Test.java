/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicJavaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author huijun
 */
public class Test {

    static String s1;

    public static void main(String[] args) {
        Test test = new Test();
        byte a = -123;
        //System.out.println(a);
        char[] ar = new char[2];
        char[] ar2 = {'a', 'b'};
        char[] ar3 = new char[]{'a', 'b'};
        final int ab = 1;

        String s = "java" + "blog";
        //System.out.print(s == "javablog");

        String str1 = "java";
        String str2 = "blog";
        String s3 = str1 + str2;
        //System.out.print(s3 == "javablog");

        ArrayList playerArray = new ArrayList();
        playerArray.add(3);	//all elements are Object class, any class can be assigned to Object 
        playerArray.add("Mary");

        List subListObj = playerArray.subList(0, playerArray.size()); //from index = 5 to index = size
        //System.out.println(subListObj.size());

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        for (int i : set) {
            //System.out.println(i);
        }

        set.clear();
        for (int i : set) {
            //System.out.println(i);
        }
        
        BasicJavaPractice bjp = new BasicJavaPractice();
        System.out.println(BasicJavaPractice.testStatic);
        BasicJavaPractice.testStatic = 4;
        bjp.testStatic = 3;
        
        System.out.println(bjp.testStatic);
        System.out.println(BasicJavaPractice.testStatic);
    }
}
