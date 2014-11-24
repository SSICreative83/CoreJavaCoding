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
public class PassByValue {
   public static void main(String args[]) {  
        String s = "abc";  
        char[] ch = {'a', 'b', 'c'};
  
        foo(s, ch);  
        System.out.println(s);          
        System.out.print(ch);
    }  
  
    public static void foo(String s, char[] ch) {  
        s = "gbc";  
        ch[0] = 'g';
    }  
}
