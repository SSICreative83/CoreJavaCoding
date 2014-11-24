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
public class RemoveDup {

    public static String removeDupChar(String s) {
        char[] originString = s.toCharArray();
        String result = "";
        for (int i = 0; i < originString.length; i++) {
            boolean isDup = false;
            char ci = originString[i];
            for (int j = 0; j < i; j++) {
                char cj = originString[j];
                if (ci == cj) {
                    isDup = true;
                }
            }
            if (isDup == false) {
                 result += originString[i];
            }
        }        
        return result;

    }
    
    public static char[] removeDupCharLocal(char[] s) {
        for(int i = 0; i < s.length && s[i] != '\0'; i++){
            for(int j = 0; j < i; j++){
                if(s[i] == s[j]){
                    for(int k = i; k < s.length - 1; k++){
                        s[k] = s[k + 1];
                    }
                    s[s.length - 1] = '\0';
                    i--;
                }               
            }
        }
        return s;
    }

}
