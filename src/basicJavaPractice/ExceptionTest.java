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
public class ExceptionTest {

    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            try {
                throw new Exception();
            } catch (Exception e2) {
                
                System.out.print("inner ");
            }
            
            System.out.print("middle ");
        }
        
        System.out.print("outer ");
    }
}
