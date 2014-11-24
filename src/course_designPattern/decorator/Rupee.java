/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Decorator;

/**
 *
 * @author huijun
 */
public class Rupee  extends Currency{
   double value;

    public Rupee() {
        description = "indian rupees";
    }

    public double cost(double v){
        value=v;
        return value;
    }

}
