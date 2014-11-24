/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Proxy;

/**
 *
 * @author huijun
 */
public class TankLogProxy implements Moveable{
    Moveable t;
    
    public TankLogProxy(Moveable t){
        super();
        this.t = t;
    }

    TankLogProxy() {
    }
    
    @Override
    public void move() {
        System.out.println("Tank start...");
        t.move();            
        System.out.println("Tank stop...");
    }
}
