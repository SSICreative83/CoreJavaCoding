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
public class USDDecorator extends Decorator{
    Currency currency;
 
    public USDDecorator(Currency currency){
        this.currency = currency;
    }

    public String getDescription(){
        return currency.getDescription()+ " ,its US Dollar";
    }

    @Override
    public double cost(double value) {
        return value;
    }

}
