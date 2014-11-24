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
public class SwitchTest {
    public static void main(String[] args){
        String test = "1";
        switch(test){
            case "2":
                System.out.println(test);
            default:
                break;
        }
        
        short s1 = 1;
        //s1 = s1 + 1;  //not correct!
        s1 += 1;        //correct
        
        char han = '汗';    //can be Chinese. 
        //char is storing Unicode
        System.out.println(han);
    }
}
