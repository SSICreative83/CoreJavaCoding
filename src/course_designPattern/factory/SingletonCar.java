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
public class SingletonCar {
    
    //Singleton pattern
    
    //class variable
    private static SingletonCar car = new SingletonCar();
    
    //private constructor
    private SingletonCar(){
        
    }
    
    //synchronized method to get instance
    public synchronized static SingletonCar getInstance(){
        return car;
    }
    
    public static void main(String[] args){
        SingletonCar newCar = SingletonCar.getInstance();
        
    }
    
}

