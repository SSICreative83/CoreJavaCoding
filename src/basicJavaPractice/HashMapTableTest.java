/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author huijun
 */
public class HashMapTableTest {
    
   public static void main(String[] args) {
       
       HashMap<Integer, String> map = new HashMap<>();
       
       Hashtable<Integer, String> table = new Hashtable<>();
       
       map.put(1, "s1");
       map.put(2, "s2");
       map.put(3, "s3");
       
       table.put(1, "s1");
       table.put(2, "s2");
       table.put(3, "s3");
       
//       Iterator iter1 = map.keySet().iterator();
//       while(iter1.hasNext()){
//           //System.out.println(iter1.next());
//           if(iter1.next().toString().equals("1")){
//               System.out.println("This is first key");
//               map.remove(1);
//           }
//       }
       
       Iterator iter2 = table.keySet().iterator();
       while(iter2.hasNext()){
           //System.out.println(iter2.next());
           if(iter2.next().toString().equals("1")){
               System.out.println("This is first key");
               table.remove(1);     //This will cause ConcurrentModificationException
           }
       }
       
        System.out.println("----------");   
        List<String> myList = new ArrayList<String>();
         
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
         
        Iterator<String> it = myList.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println("List Value:"+value);
            if(value.equals("3")) myList.remove(value);
        }
         
        Map<String,String> myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");
 
        Iterator<String> it1 = myMap.keySet().iterator();
        while(it1.hasNext()){
            String key = it1.next();
            System.out.println("Map Value:"+myMap.get(key));
            if(key.equals("2")){
                myMap.put("1","4");
                //myMap.put("4", "4");  //this line will cause cocurrentModificationException
            }
        }
   }    
}
