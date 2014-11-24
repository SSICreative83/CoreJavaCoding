/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap19_Moderate;

import java.util.Hashtable;

/**
 *
 * @author huijun
 */
public class Test {
    public static void main(String[] args){
        int a = 5, b = 2;
        //System.out.println(MaxInTwo.maxInTwo(a, b));
        
        int[] A = new int[]{1,3,4};
        //System.out.println(A.length);
        A[2] = 0;
        //A.length--;

        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        table.put(1, 2);
        table.put(1, 3);
        System.out.println(table.get(1));
        
    }
}
