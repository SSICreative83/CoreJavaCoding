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
public class CurrencyCheck {

    public static void main(String[] args) {

        // without adding decorators
        Currency curr = new Dollar();

        System.out.println(curr.getDescription() + " dollar. " + curr.cost(2.0));

        //adding decorators
        Currency curr2 = new USDDecorator(new Dollar());

        System.out.println(curr2.getDescription() + " dollar. " + curr2.cost(4.0));

        Currency curr3 = new SGDDecorator(new Dollar());

        System.out.println(curr3.getDescription() + " dollar. " + curr3.cost(4.0));

    }
}
