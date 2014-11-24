/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interview.CodeEval;

/**
 *
 * @author huijun
 */
public class LongestRepSubString {
    
    //BUGS
    public static String longest(String s){
        if(s == null || s.length() == 0)    return "NONE";
        int len = s.length();
        
        for(int slen = len; slen > 0; slen--){
            for(int i = 0; i + slen <= len ; i++){
                String cur = s.substring(i, i + slen);
                if(s.substring(i + slen - 1).indexOf(cur) != -1){
                    if(cur.trim() != "")    return cur;
                }
            }
        }
        return "NONE";
    }
    
    public static void main(String[] args){
        int[] arr = {1, 2, 3};
        System.out.println(longest("am so uniqe"));
    }
    
}
