/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicJavaPractice;

import java.util.*;

/**
 *
 * @author huijun
 */
public class Permutations {

    public static List<String> permutations(String s) {

        if (s == null || s.length() == 0) {
            return new ArrayList<String>();
        }

        char[] arr = s.toCharArray();
        List<String> res = new ArrayList<String>();
        
        if(s.length() == 1){
            res.add(s);
            return res;
        }

        for (int i = 0; i < arr.length; i++) {
            char cur = arr[i];

            //build permutations of remaining chars
            String str = "";
            for (int j = 0; j < i; j++) {
                str += arr[j];
            }

            for (int j = i + 1; j < arr.length; j++) {
                str += arr[j];
            }

            for (String str1 : permutations(str)) {    //bc, cb
                String tmp = cur + str1;        // abc, acd
                res.add(tmp);
            }
        }
        return res;

    }
    
    public static void main(String[] args){
        for(String a : permutations("abc")){
            System.out.println(a);
        }
    }

}
