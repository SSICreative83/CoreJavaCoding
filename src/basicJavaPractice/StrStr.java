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
public class StrStr {
    
    //common error1: KMP
    //common error2: coding style (as following)
    
    public int strStr(String s1, String s2){
        if(s1 == null || s2 == null){   //need to handle special case first, to make sure no error
            return -1;
        }     
        
        int j;       
        for(int i = 0; i < s1.length() - s2.length() + 1; i++){
            
            for(j = 0; j < s2.length(); j++){
                if(s1.charAt(i + j) != s2.charAt(j)) break;               
            }
            
            if(j == s2.length())    return i;
        }
        
        return -1;
    }

    public int strStrGood(String s1, String s2){
        if(s1 == null || s2 == null){   //need to handle special case first, to make sure no error
            return -1;
        }     
        
        int i, j;       
        for(i = 0; i < s1.length() - s2.length() + 1; i++){           
            for(j = 0; j < s2.length(); j++){
                if(s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }               
            }
            
            if(j == s2.length()){
                return i;
            }
        }
        
        return -1;
    }
    
    
}
