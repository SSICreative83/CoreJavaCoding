/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author huijun
 */
public class PhoneNumber {
    public static List<String> letterComIter(String digits){
    String[] map = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> result = new ArrayList<String>();

    int  i = 0;
    List<String> nqueue = new ArrayList<>();
    while(i < digits.length()){
        
        String cur = map[digits.charAt(i) - '0'];
        
        if(result.isEmpty()){
            for(int j = 0; j < cur.length(); j++){
                nqueue.add(cur.charAt(j)+"");
            }
        }else{
            nqueue.clear();
            for(String tmp : result){               
                
                for(int j = 0; j < cur.length(); j++){
                    nqueue.add(tmp + cur.charAt(j));
                }
            }            
        } 
        
        result.clear();
        for(String tmp : nqueue){
            result.add(tmp);
        }
        i++;
    }    
    
    return result;
}

public static List<String> letterComRecur(String digits){
    String[] map = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> result = new ArrayList<String>();

    dfs(digits, map, 0, "", result);
    return result;
}

public static void dfs(String digits, String[] map, int index, String tmp, List<String> result){

    if(index == digits.length()){
        result.add(tmp);
        return;
    }

    String cur = map[digits.charAt(index) - '0'];

    for(int i = 0; i < cur.length(); i++){
        String ntmp = tmp + cur.charAt(i);
        dfs(digits, map, index + 1, ntmp, result);
    }

}

public static void main(String[] args){
    System.out.println(letterComIter("23"));
    
}
}
