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
public class HexToInt {
    
    //assumption: the given string are starting with "0x" or "x" or just a hex number
    //assumption: the numbers are positive
    public static int convertHexToInt(String s) {
        String ns = s;
        if (s.startsWith("0x")) {
            ns = s.substring(2);
        } else if (s.startsWith("x")) {
            ns = s.substring(1);
        }

        long res = 0;        
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', 
               '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        //adding up each digits
        for (int i = 0; i < ns.length(); i++) {
            char cur = ns.charAt(i);
            int j = 0;
            for(; j < hexDigits.length; j++){
                if(hexDigits[j] == cur){
                    break;
                }
            }
            res = 16 * res + j;
        }
        
        //deal with large number which is greater than Integer.MAX_VALUE
        int ret = 0;
        if(res > Integer.MAX_VALUE){
            ret = Integer.MAX_VALUE;
        }else{
            ret = (int)res;
        }
        
        return ret;
    }
    
     public static void main(String[] args) { 
         
         System.out.println(convertHexToInt("0xAB"));
     }
    
}
