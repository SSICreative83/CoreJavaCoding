/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

/**
 *
 * @author huijun
 */
import java.util.Hashtable;  
import java.util.Map.Entry;
   
public class HashtableRead {  
   
    public static void main(String a[]){  
           
        Hashtable<String, String> hm = new Hashtable<>();  
        //add key-value pair to Hashtable  
        hm.put("first", "FIRST INSERTED");  
        hm.put("second", "SECOND INSERTED");  
        hm.put("third","THIRD INSERTED");  
        System.out.println(hm);  
  
        for(Entry entry : hm.entrySet()){  
            System.out.println(entry.getKey() + ":" + entry.getValue());  
        }  
    }  
}  
