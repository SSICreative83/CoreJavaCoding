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
public class EnumTest {
    public static void main(String[] args){
        
        Direction d = Direction.ENUM_DOWN;
        int x = d.getEnumX();
        int y = d.getEnumY();
        
        //Direction d2 = new Direction(1,1);
    }
}
