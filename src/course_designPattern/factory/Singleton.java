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
public class Singleton  
{  
    private static Singleton singleton = null;  
  
    private Singleton()  
    {  
    }  
    public static Singleton getInstance()  
    {  
        if (singleton == null)   //if instance has been created, no need to synchronize
        {  
            synchronized (Singleton.class)   
            {  
                if (singleton == null)   //if instance has been created, don't create again
                {  
                    singleton = new Singleton();  
                }  
            }  
        }  
        return singleton;  
    }  
}
