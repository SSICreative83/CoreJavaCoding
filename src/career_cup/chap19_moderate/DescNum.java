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
public class DescNum {
    
    //assume input is less than 1 trillion 1,000,000,000,000, so largest is 999,999,999,999
    //actually Integer.MAX_VALUE = 2,147,483,647
    
    public static String desNum(int num){
        String sb = "";
        if(num == 0)    return "zero";
        if(num < 0){
            sb += "negative ";
            num = -1 * num;
        }
        
        int count = 0;
        
        while(num > 0){
            
            if(num % 1000 != 0){
                int current = num % 1000;           
                //sb = desCurrent(current) + bigs[count] + " " + sb;                                                                  
            }
            
            num = num / 1000;
            count++;
        }
        
        
        return sb.trim();
    }
    
    public static String desCurrent(int current){
        
        String s = "";
        if(current >= 100){
            //s += digit[current / 100] + "hundred ";
            current = current % 100;
        }
        
        if(current >= 11 && current <= 19){
            //s += teens[current / 10] + " ";
            return s;
        }
        
        if(current == 10 || current >= 20){
            //s += tens[current / 10] + " ";
            current = current % 10;
        }
        
        if(current > 0){
            //s += digit[current] + " ";
        }
        
        return s;
    }

    public static void main(String[] args) {
         System.out.println(desNum(1234));
    }

}
