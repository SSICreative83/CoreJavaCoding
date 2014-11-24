/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap8_Recursion;

import java.util.ArrayList;

/**
 *
 * @author huijun
 */
public class ProblemsTests {
    public static void main(String[] args){
        //P1
        System.out.println(Fibonacci.fibonacci(5));
        
        //P4
        String test1 = "abc";
        ArrayList<String> result1 = Permutation.getPermutations(test1);
        for(String s : result1){
            System.out.println(s);
        }
        
        //P5
        Parentheses.printParentheses(3);
    }
}
