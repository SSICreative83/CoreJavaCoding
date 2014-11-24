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
public class BitsToConvert {
    public static int numOfBitsToConvert(int a, int b){
        int XORresult = a ^ b;
        String resultString = Integer.toBinaryString(XORresult);   
        char[] resultArray = resultString.toCharArray();
        int length = resultArray.length;
        int count = 0;
        for(int i = 0; i < length; i++){
            if(resultArray[i] == '1'){
                count++;
            }
        }  
        return count;
    }   
}
