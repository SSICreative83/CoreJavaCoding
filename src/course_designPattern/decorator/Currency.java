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
public abstract class Currency {
    String description = "Unknown currency";
    
    public String getDescription() {
        return description;
    }

    public abstract double cost(double value);

}

