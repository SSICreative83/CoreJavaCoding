/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author huijun
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); //abstract class, can't be instantiated
        //cal.add(Calendar.MONTH, -6); //get time 5 month ago
        String result = "year: " + cal.get(Calendar.YEAR) + " month: " + cal.get(Calendar.MONTH);
        
        System.out.println(result);
        
        Date date = cal.getTime();
        
        System.out.println(date);
    }
}
