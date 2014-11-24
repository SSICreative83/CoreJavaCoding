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
public class ReplaceSpace {
    public static final int CAPACITY = 50;
    public static char[] replaceSpace(char[] s){
        char[] result = new char[CAPACITY];
        for(int i = 0, j = 0; i < s.length; i++){
            if(s[i] == ' '){                               
                result[j++] = '%';
                result[j++] = '2';
                result[j++] = '0';
                
            }
            else
                result[j++] = s[i];
        }
        return result;
    }
    
}
