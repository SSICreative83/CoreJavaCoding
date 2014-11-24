/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap8_Recursion;

/**
 *
 * @author huijun
 */
public class Parentheses {
    public static void printParentheses(int count) {
        char[] str = new char[count * 2];
        printParentheses(count, count, str, 0);
    }
    
    public static void printParentheses(int l, int r, char[] str, int count) {
        if(l < 0 || r < 1) return;
        if(l == 0 && r == 0){
            System.out.println(str);           
        }else{
            if(l > 0){
                str[count] = '(';
                printParentheses(l - 1, r, str, count + 1);
            }
            if(r > 1){
                str[count] = ')';
                printParentheses(l, r - 1, str, count + 1);
            }
        }
    }
}
