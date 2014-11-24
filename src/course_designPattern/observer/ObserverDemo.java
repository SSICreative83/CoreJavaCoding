/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Observer;

/**
 *
 * @author huijun
 */
public class ObserverDemo {
    public static void main(String[] args){
        Teacher teacher = new Teacher();
        Student s1 = new XiaoBai();
        Student s2 = new XiaoHei();
        teacher.register(s1);
        teacher.register(s2);
        teacher.lecture();
                
    }
}
