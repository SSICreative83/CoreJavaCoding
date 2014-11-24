/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huijun
 */
public class Teacher {
    private List students = new ArrayList();
    
    public void register(Student student){
        students.add(student);
    }
    
    public void lecture(){
        System.out.println("Today we are learning observer pattern");
        for(int i = 0; i < students.size(); i++){
            Student s = (Student)students.get(i);
            s.reaction();
        }
    }  
    
}
