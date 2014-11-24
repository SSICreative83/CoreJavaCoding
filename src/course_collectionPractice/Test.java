/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author huijun
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //JavaBean
        Employee e = new Employee(1, "name1", 100, "1", "2007-10");                
        List<Employee> list = new ArrayList<Employee>();
        list.add(e);        
        printEmpName(list);
        
        //One Map for one row
        Map map = new HashMap();
        map.put("id", 3031);
        map.put("name", "name1");
        map.put("salary", 3000);
        map.put("department", "dep1");
        
        List<Map> list2 = new ArrayList<>();
        list2.add(map);
        printEmpName2(list2);
        
        //Test Iterator
        Set set = new HashSet();
        set.add("a1");
        set.add("a2");
        set.add("a2");
        
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            String str = (String)iter.next();
            System.out.println(str);
        }
    }
    
    public static void printEmpName(List<Employee> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName());
        }
    }
    
   public static void printEmpName2(List<Map> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).get("name"));
        }
    }
}
