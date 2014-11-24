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
public class Client {
    public static void main(String[] args){
        Tank t = new Tank();
        TankTimeProxy ttp = new TankTimeProxy(t);
        TankLogProxy tlp = new TankLogProxy(ttp);                
        Moveable m = tlp;
        m.move();
        
        TankLogProxy tlp2 = new TankLogProxy(t); 
        TankTimeProxy ttp2 = new TankTimeProxy(tlp2);                     
        Moveable m2 = ttp2;
        m2.move();
              
    }
}
