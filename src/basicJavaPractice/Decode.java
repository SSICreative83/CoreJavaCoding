/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

/**
 *
 * @author huijun
 */
public class Decode {
    public static int numDecodings(String s) {
        int len = s.length();
        if(len == 0)    return 0;
        
        int[] result = new int[len + 1];
        result[0] = 1;  //initial value is important! dump field
        
        if(isValid(s.substring(0, 1))) {    //process the first character
            result[1] = 1;
        }else   result[1] = 0;
        
        for(int i = 2; i <= len; i++) {
            if(isValid(s.substring(i - 1, i))){ //previous character, not index i
                result[i] = result[i - 1];
            }
            if(isValid(s.substring(i - 2, i - 1))){
                result[i] += result[i - 2];
            }
        }
        return result[len];
    }
    
    public static boolean isValid(String s) {
        if(s.charAt(0) == '0')  return false;
        int num = Integer.parseInt(s);
        return num <= 26 && num >= 1;
    }  
    
    public static void main(String[] args){
        System.out.println(numDecodings("27"));
    }
}
