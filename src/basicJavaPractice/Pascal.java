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
public class Pascal {

    public static ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (rowIndex < 0) {
            return res;
        }
        res.add(1);
        if(rowIndex == 0)   return res;

        for (int i = 1; i <= rowIndex; i++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>(res);
            for (int j = 1; j < i; j++) {
                res.set(j, tmp.get(j - 1) + tmp.get(j));
            }
            res.add(1);
        }
        
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = getRow(3);
        System.out.println(result);
    }
}
