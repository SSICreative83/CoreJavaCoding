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
enum WeekDay2 {
    SUN(1), MON, TUE, WED, THU, FRI, SAT;
    
    private WeekDay2(){
        
    }
    
    private WeekDay2(int day){
        
    }
}

public enum TrafficLamp{
    RED{
        public TrafficLamp nextLamp(){
            return GREEN;
        }        
    }, 
    GREEN{
        public TrafficLamp nextLamp(){
            return YELLOW;
        }
    }, 
    YELLOW{
        public TrafficLamp nextLamp(){
            return RED;
        }
    };
    public abstract TrafficLamp nextLamp();
}