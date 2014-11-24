/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap8_Recursion;

/**
 *
 * @author huijun
 */
public class Fibonacci {
    public static int fibonacci(int n){
        if(n < 1)
            return Integer.MIN_VALUE;
        else if(n == 1 || n == 2)
            return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
