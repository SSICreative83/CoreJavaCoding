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
public class MaxInTwo {
    public static int maxInTwo(int a, int b){
        int c = a - b;
        int k = (c >> 31) & 0x1;
        return a - k * (a - b);
    }
}
