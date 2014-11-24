/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interview.Oracle;

/**
 *
 * @author huijun
 * 
 * The method returns the starting index of max repeated character in the input string
 * eg. input: aabbbccccddcc, output: 5
 */
public class CodingProblem {
    
    public int maxRepChar(String s){
        int len = s.length();
        if(len == 0)    return 0;
        
        int startIndex = 0, curLen = 1, maxLen = 0;
        
        for(int i = 1; i < len; i++){  //start from index = 1, since need to compare to previous char      
            char c = s.charAt(i);
            
            if(c == s.charAt(i - 1)){       
                curLen++;           //update current repeated length
            }else{
                curLen = 1;         //reset curLen 
            }
            
            if(curLen > maxLen){
                maxLen = curLen;  
                System.out.println(maxLen);
                startIndex = i - curLen + 1;    //calculate starting index of current max repeated char
            }            
        }
        return startIndex;
    }
    
    public int maxRepChar2(String s){
        int len = s.length();
        if(len == 0)    return -1;
        int start = 0, maxLen = 1, curLen = 1;
        char pre = s.charAt(0);
        
        for(int i = 1; i < len; i++){
            char cur = s.charAt(i);
            if(pre == cur){
                curLen++;
                if(curLen > maxLen){
                    maxLen = curLen;
                    start = i - curLen + 1;
                }
            }else{
                curLen = 1;
                pre = cur;
            }
        }
        return start;
    }
    
    public static void main(String[] args){
        CodingProblem test = new CodingProblem();
        System.out.println(test.maxRepChar2("aabbbb"));
    }
    
}
