/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package career_cup.chap1_stringHash;

/**
 *
 * @author huijun
 */
public class Anagram {
    public static boolean isAnagram(char[] s1, char[] s2){
        char[] s1Sort = BubbleSort(s1);
        char[] s2Sort = BubbleSort(s2);
        for(int i = 0; i < s1Sort.length; i++){
            if(s1Sort[i] != s2Sort[i])
                return false;
        }
        return true;
        
    }
    
    public static char[] BubbleSort(char[] s){
        for(int i = 0; i < s.length; i++){
            for(int j = i; j < s.length; j++){
                if(s[i] > s[j]){
                    char tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }       
        return s;
    }
    
}
