/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Factory;

/**
 *
 * @author huijun
 */
public class Test {
    public static void main(String[] args){
        Car c = Car.getInstance();
        Car c2 = Car.getInstance();
        if(c == c2) System.out.println("same car");
        c.run();
        
        Moveable m = new Plane();
        m.run();
        
        PlaneFactory factory = new PlaneFactory();
        Moveable m2 = factory.create();
        m2.run();
        
        BroomFactory factory3 = new BroomFactory(); //the factory is the only thing need to change
        Moveable m3 = factory3.create();
        m3.run();
        
        
    }
}
