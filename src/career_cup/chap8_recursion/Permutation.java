/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap8_Recursion;

import java.util.ArrayList;

/**
 *
 * @author huijun
 */
public class Permutation {
    public static ArrayList<String> getPermutations(String s){
        ArrayList<String> allPermutations = new ArrayList<>();
        ArrayList<String> subPermutations = new ArrayList<>();
        if(s == null) return null;
        else if(s.length() == 0){
            allPermutations.add("");
            return allPermutations;
        }
        
        char[] charArray = s.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            String subs = "";
            String news = "";
            for(int j = 0; j < charArray.length; j++){
                if(j != i)
                    subs += charArray[j];
            }           
            
            subPermutations = getPermutations(subs);
            
            for(String sInSub : subPermutations){
                news = charArray[i] + sInSub;             
                allPermutations.add(news);
            }
        }
         
        return allPermutations;
    }
    
}
