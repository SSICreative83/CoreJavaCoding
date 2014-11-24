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
public class Car implements Moveable{
        
    private static Car car = new Car();     
    private Car(){}
       
    public synchronized static Car getInstance(){    //static factory pattern(method)
   
//        if(true){   //add a condition to control access to the instance, eg. has driver liscense
//            return car;
//        }
//        else return null;
        return car;
    }
            
    @Override
    public void run() { //Factory method
        System.out.println("car is going to...");
    }
}
