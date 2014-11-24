/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap19_Moderate;

/**
 *
 * @author huijun
 */
public class SwapInPlace {
    public static void swapInPlace(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
    }
    
    public static void swapInPlaceOpt(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}
