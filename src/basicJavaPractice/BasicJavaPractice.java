/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author huijun
 */
public class BasicJavaPractice {
    public static int testStatic = 1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        SimpleDateFormat bartDateFormat = new SimpleDateFormat("EEEE-MMMM-dd-yyyy"); //yyyy-MM-dd
        Date date = new Date();
        System.out.println(date.getTime()); //# of ms from 1970...
        System.out.println(bartDateFormat.format(date));    
        
        String s = "a bcde";
        System.out.println(s.substring(0, 3));
        System.out.println(s.charAt(0));
        
        char c = 'a';
        System.out.println(s.startsWith("a"));
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Collections.reverse(list);
        System.out.println(list);
        
        HashMap<String, String> table = new HashMap<>();
        table.put("1", "test1");
        table.put("1", "test2");
        System.out.println(table.get("1"));
        
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.contains(1);
        
        BasicJavaPractice obj = new BasicJavaPractice();
        obj.suit = Suit.SPADES;
        System.out.println("abcd".startsWith("ab"));
        
        int[] result = new int[2];
        int[] result2 = {1, 2};
        int[] result3 = new int[]{1,2};
        
        int h = 1;
        assert (h >= 0 && h < 2);
        
        testStatic = 2;

    }
    
    public static double plus(double a, double b){
        return a + b;
    }
    
    public enum Suit{
        CLUBS(1), SPADES(2);
        int value;
        private Suit(int v){    //constructor is private!
            value = v;
        }
    }
    private Suit suit;
    public int value(){
        return suit.CLUBS.value;
    }
}
