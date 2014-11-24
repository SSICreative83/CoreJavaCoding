/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

import java.util.ArrayList;

/**
 *
 * @author huijun
 */
public class ReverseWords {
       public static String reverseWords(String s) {
        if(s.length() == 0) return "";
        
        ArrayList<String> array = new ArrayList<String>();
        //char[] stringArray = s.toCharArray();
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        //remove leading/trailing 0s
        while(s.length() != 0 && s.charAt(0) == ' ') s = s.substring(1, s.length());
        System.out.println(s.length());
        while(s.length() != 0 && s.charAt(s.length() - 1) == ' ') s = s.substring(0, s.length() - 1);
        if(s.length() == 0) return "";
        
        int newStart = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(newStart) == ' '){
                newStart++;
                continue;
            }   
            if(s.charAt(i) == ' '){
                array.add(s.substring(newStart, i));
                newStart = i + 1;
            }
        }
        //add last word
        array.add(s.substring(newStart, s.length()));
        
        //reverse array
        for(int j = 0; j < array.size() / 2; j++){
            String tmp = array.get(j);
            array.set(j, array.get(array.size() - j - 1));
            array.set(array.size() - j - 1, tmp);
        }
        
        //construct result
        String result = "";
        for(int j = 0; j < array.size(); j++){
            result += array.get(j) + " ";
        }
        
        result = result.substring(0, result.length() - 1);
        return result;
    } 
       
     public static void main(String[] args){
         System.out.println(reverseWords(" "));
     }
}
