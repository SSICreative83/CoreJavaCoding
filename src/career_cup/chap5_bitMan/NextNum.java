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
public class NextNum {
    public static boolean GetBit(int n, int index){
        return (n & (1 << index)) > 0;       
    }
    public static int SetBit(int n, int index, boolean b){
        if(b){
            return n | (1 << index);
        }
        else{
            return n & ~(1 << index);
        }
    }
    public static int nextSmallestLargerThanInput(int input){
        //from right to left, toggle first 0 after one 1
        if(input < 0){
            return -1;
        }
        
        int index = 0;
        int countOnes = 0;
        
        //find first 1
        while(!GetBit(input, index)) index++;
        
        //toggle 0 after it
        index++;
        while(GetBit(input, index)) {
            index++;
            countOnes++;
        }
        
        input = SetBit(input, index, true);
        
        //turn off previous one
        index--;
        input = SetBit(input, index, false);
        countOnes--;
        
        //set zeros
        for(int i = index - 1; i >= countOnes; i--){
            input = SetBit(input, i, false);
        }
        
        //set ones
        for(int i = 0; i <= countOnes; i++){
            input = SetBit(input, i, true);
        }
        return input;
    }
    //public static int nextLargestSmallerThanInput(int input){
        //from right to left, toggle first 1 after one 0
        
    //}
}
