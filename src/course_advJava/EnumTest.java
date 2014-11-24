/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_advancedJava;

/**
 *
 * @author huijun
 */
public class EnumTest {
    public static void main(String[] args){
        WeekDay weekDay = WeekDay.Mon;
        System.out.println(weekDay.nextDay());
    }
}

abstract class WeekDay { //use normal class to implement enum
    private WeekDay(){}
    
    public abstract WeekDay nextDay();
    
    public static final WeekDay Sun = new WeekDay(){ //内部类
        @Override
        public WeekDay nextDay(){
            return Mon;
        }
    };
    
    public static final WeekDay Mon = new WeekDay(){
        @Override
        public WeekDay nextDay(){
            return Sun;
        }
    };
    
//    public WeekDay nextDay(){
//        if(this == Sun){
//            return Mon;
//        }else {
//            return Sun;
//        }        
//      
    
    public String toString(){
        return this == Sun ? "SUN" : "MON";
    }
}