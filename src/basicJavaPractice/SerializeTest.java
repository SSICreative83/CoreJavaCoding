/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicJavaPractice;

import java.io.Serializable;

/**
 *
 * @author huijun
 */
public class SerializeTest {

    public static void main(String[] args) {
        Traveler t = new Traveler();
        
        t.x1 = 7;   //static var can be changed by class instance 
        t.x2 = 7;
        t.x3 = 7;
        
        // serialize t then deserialize t
        System.out.println(t.x1 + " " + t.x2 + " " + t.x3);
    }
}

class Traveler implements Serializable {

    static int x1 = 0;
    volatile int x2 = 0;
    transient int x3 = 0;
}
