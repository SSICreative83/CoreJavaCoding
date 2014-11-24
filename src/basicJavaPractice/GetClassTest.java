/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

import java.util.Date;
/**
 *
 * @author huijun
 */
public class GetClassTest extends Date{
    public static void main(String[] args){
        new GetClassTest().test();
    }
    public void test(){
        System.out.println(getClass().getName());//BasicJavaPractice.GetClassTest
        System.out.println(super.getClass().getName());//BasicJavaPractice.GetClassTest
    }
}
