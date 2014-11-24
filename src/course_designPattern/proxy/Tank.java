/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Proxy;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author huijun
 */
public class Tank implements Moveable{

    @Override
    public void move() {
        //long start = System.currentTimeMillis();
        System.out.println("Tank Moving...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Tank.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //long end = System.currentTimeMillis();
        //System.out.println("time" + (end - start));
    }
    
}
