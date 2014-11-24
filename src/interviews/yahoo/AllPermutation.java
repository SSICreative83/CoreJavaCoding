/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interview.Yahoo;

import java.util.ArrayList;

/**
 *
 * @author huijun
 */
public class AllPermutation {
    public static void main(String[] args){
        System.out.println(allPermutation("abc"));
    }
    
    public static ArrayList<String> allPermutation(String input){
        ArrayList<String> result = new ArrayList<>();
        int len = input.length();
        if(len == 0)    return result;

        String tmp = "";
        Boolean[] visited = new Boolean[len];
        for(int i = 0; i < len; i++){
            visited[i] = false;
        }
        dfs(result, tmp, input, visited);
        
        return result;
    }
    
    public static void dfs(ArrayList<String> result, String tmp, 
            String input, Boolean[] visited){
        
        if(tmp.length() == input.length()){
            result.add(tmp);
            return;
        }
        
        for(int i = 0; i < input.length(); i++){
            if(!visited[i]){
                tmp += input.charAt(i);
                visited[i] = true;
            
                dfs(result, tmp, input, visited);
                tmp = tmp.substring(0, tmp.length() - 1);
                visited[i] = false;  
            }
        }              
        
    }
}
