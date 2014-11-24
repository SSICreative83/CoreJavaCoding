/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

import java.util.Arrays;

/**
 *
 * @author huijun
 */
public class Test2 {
    public static void main(String[] args){
        
        //test Arrays.toString(char[] a)
        char[] arr = new char[]{'1', '2', '3'};
        System.out.println(Arrays.toString(arr));
        
        //test string to int, int to string
        System.out.println(Integer.valueOf("123"));
        System.out.println(String.valueOf(123));
        
    }
    
}
