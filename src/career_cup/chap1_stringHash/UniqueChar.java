/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap1_StringHash;

/**
 *
 * @author huijun
 */
public class UniqueChar {
    public static final int SIZE = 32;
    public static boolean isUniqueString(String s){
        char[] originArray = s.toCharArray();
        char[] checkArray = new char[SIZE];
        int i = 0;
        boolean uniqueString = true;
        
        for(char c : originArray){
            boolean uniqueChar = true;
            for(char ch : checkArray){
                if(c == ch){
                    uniqueString = false;
                    uniqueChar = false;
                    break;                   
                }
            }
            if(uniqueChar == true)
                checkArray[i++] = c;   
        }       
        return uniqueString;
    }
    
    public static boolean isUniqueStringLocal(String s){
        char[] originArray = s.toCharArray();
        boolean uniqueString = true;
        
        for(int i = 0; i < originArray.length; i++){
            char c = originArray[i];
            for(int j = 0; j < i; j++){
                char ch = originArray[j];
                if(c == ch){
                    uniqueString = false;
                    break;                   
                }
            }
        }       
        return uniqueString;
    }
    
}
