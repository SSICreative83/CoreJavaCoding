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
public class TankTimeProxy implements Moveable{
    Moveable t;
    
    public TankTimeProxy(Moveable t){
        super();
        this.t = t;
    }

    TankTimeProxy() {
    }
    
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        t.move();       
        long end = System.currentTimeMillis();
        System.out.println("time" + (end - start));
    }
    
}
