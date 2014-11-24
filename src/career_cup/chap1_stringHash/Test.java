/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CareerCup.Chap1_StringHash;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author huijun
 */
public class Test {

    public static HashMap<Integer, Student> buildMap(ArrayList<Student> students) {
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        for (Student s : students) {
            map.put(s.getId(), s);
        }
        return map;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1001, "Zhang"));
        students.add(new Student(1002, "Li"));

        HashMap<Integer, Student> map = buildMap(students);
        map.put(1003, new Student(1003, "Wang"));
        map.remove(1001);

//        for (Integer i : map.keySet()) {
//            System.out.println("Student name = " + map.get(i).getName() + ", id = " + i);
//        }
        HashTable table = new HashTable();
        table.put(1, new Student(1001, "Zhang"));
        table.put(1, new Student(1002, "Li"));
        table.put(2, new Student(1003, "Zhao"));
        for (int i = 0; i < table.getSize(); i++) {
            System.out.println(i);
            HashTableItem item = table.searchByIndex(i);
            System.out.println("Student name = " + item.getValue() + ", id = " + item.getKey());
        }

    }

}
