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
public class ReverseString {
    public static String reverseString(String s){
        char[] originString = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0, j = originString.length - 1; i < originString.length/2; i++, j--){
            char tmp = originString[i];
            originString[i] = originString[j];
            originString[j] = tmp;                   
        }
        for(char c:originString)
            sb.append(c);
        return sb.toString();
    }   
}
