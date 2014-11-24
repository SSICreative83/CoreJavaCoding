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
public class TestArgs {
   public static void main(String[] args) {
        for(String arg : args) {
            System.out.println(arg);
        }
        //System.out.println(sum(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }
    
}
