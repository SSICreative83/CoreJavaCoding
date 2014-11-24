/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author huijun
 */
public class TestEquals {
    public static void main(String[] args){
        List list = new ArrayList();
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        Date d = new Date();
        list.add(s1);
        list.add(s2);
        System.out.println(s1.equals(s2));
        
        int a = 0b00_11;    //JDK7 attribute
        System.out.println(a);
    }
}
