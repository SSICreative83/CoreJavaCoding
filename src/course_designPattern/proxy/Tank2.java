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
public class Tank2 extends Tank{
    @Override
    public void move(){
        long start = System.currentTimeMillis();
        super.move();       
        long end = System.currentTimeMillis();
        System.out.println("time" + (end - start));
    }
}
