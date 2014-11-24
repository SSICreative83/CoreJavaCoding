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
public class BroomFactory extends VehicleFactory{
    public Moveable create(){
        return new Broom();
    }
}
