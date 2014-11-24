/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Iterator;
import Course_DesignPatterns.Iterator.ArrayList;
import Course_DesignPatterns.Iterator.LinkedList;
/**
 *
 * @author huijun
 */
public class Test {
    public static void main(String[] args){
        Collection c = new ArrayList();
        for(int i = 0; i < 15; i++){
            c.add(new Cat(i));
        }
        System.out.println(c.size());
        
        Iterator it = c.iterator();
        while(it.hasNext()){
            Object o = it.next();
            System.out.print(o + " ");
        }

    }
}
