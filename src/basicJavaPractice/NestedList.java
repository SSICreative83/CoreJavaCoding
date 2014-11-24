/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

import java.util.ArrayList;

/**
 *
 * @author huijun
 */
public class NestedList {
    public static void main(String[] args) {
        ArrayList test1 = new ArrayList();
        test1.add(2);
        ArrayList test2 = new ArrayList();
        test2.add(4);
        ArrayList test3 = new ArrayList();
        test3.add(6);
        test2.add(test3);
        test1.add(test2);
        
        System.out.println(calculate(test1));
    }
    
    public static int calculate(ArrayList list) {
        if(list == null || list.isEmpty())    return 0;
        return calculate(list, 1);
    }
    
    public static int calculate(ArrayList list, int level) {
        int sum = 0;
        for(Object o : list) {
            if(o instanceof Integer) {
                sum += (Integer)o * level;
            } else if(o instanceof ArrayList){
                sum += calculate((ArrayList)o, level + 1);
            } 
        }
        return sum;
    }
    
}
