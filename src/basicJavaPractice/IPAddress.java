/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huijun
 */
public class IPAddress {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();    //List is abstract, can't be instantiated
        if(s.length() < 4 || s.length() > 12)   return result;
        
        String tmp = "";
        dfs(s, 0, s.length() - 1, tmp, result, 0);
        return result;
    }
    
    public static void dfs(String s, int start, int end, String tmp, List<String> result, int count) {
        if(count == 3 && isValid(s.substring(start, end + 1))){
            tmp += s.substring(start, end + 1);
            result.add(tmp);
            return;
        }else if(count >= 3){
            return;
        }
        
        //for(int i = start; i <= end; i++){
        for(int j = start + 1; j <= end + 1 && j <= start + 3; j++){  //at most 3 letters
            if(isValid(s.substring(start, j))){
                String ntmp = tmp + s.substring(start, j) + ".";
                dfs(s, j, end, ntmp, result, count + 1);
            }
        }
        //}
    }
    
    public static boolean isValid(String s) {
        if(s.length() == 0)     return false;
        if(s.charAt(0) == '0')  return s.equals("0");
        
        int result = Integer.parseInt(s);
        
        return result <= 255 && result > 0; 
    }
    
    public static void main(String[] args){
        List<String> result = new ArrayList<String>();        
        result = IPAddress.restoreIpAddresses("0000");

        System.out.println(result);
    }
}
