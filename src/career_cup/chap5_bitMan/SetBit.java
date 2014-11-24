/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap5_BitMan;

/**
 *
 * @author huijun
 */
public class SetBit {
    public static int setBit(int M, int N, int i, int j){
        if(i < 0 || i > j || j > 31)
            return -1;
        
        int max = ~0;
        int left = max - (1 << (j + 1) - 1);
        int right = 1 << i - 1;
        int mask = left | right;
        return (N & mask | (M << i));       
    }   
}
