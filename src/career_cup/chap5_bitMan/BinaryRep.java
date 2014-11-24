/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap5_BitMan;

import java.util.ArrayList;

/**
 *
 * @author huijun
 */
public class BinaryRep {
    public static String binaryRepresentation(String decimalString){
        char[] decimalArray = decimalString.toCharArray();
        boolean negative = false;       
        int i = 0;      
        int intPart = 0;
        double pointPart = 0.0;
        String result = "";
          
        if(decimalArray[0] == '-'){           
            negative = true;
            i = 1;
        }    
       
        if(decimalString.indexOf(".") != -1){
        intPart = Integer.parseInt(decimalString.substring(i, decimalString.indexOf(".")));
        pointPart = Double.parseDouble(decimalString.substring(decimalString.indexOf("."), decimalString.length()));
        }else{
            intPart = Integer.parseInt(decimalString.substring(i, decimalString.length()));
        }
               
        //convert int part
        String intString = "";
        while(intPart > 0){
            int r = intPart % 2;
            intPart = intPart / 2;
            intString = r + intString;
        }
       
        //convert decimal part       
        StringBuffer decString = new StringBuffer();
        while(pointPart > 0){         
            if(decString.length() > 32){
                return "ERROR";
            }
            
            if(pointPart == 1){
                decString.append("1");
                break;
            }
            double pointPart2 = 2 * pointPart;
            
            if(pointPart2 >= 1){    //if 1, don't * 2
                decString.append("1");
                pointPart = pointPart * 2 - 1;               
            }
            else{                   //if 0, * 2
                decString.append("0");
                pointPart = pointPart * 2;              
            }                              
        }
   
        if(negative == true)
            result += "-";
        result += intString + "." + decString.toString();                           
        return result;
    }
}
