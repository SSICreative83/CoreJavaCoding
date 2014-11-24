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
public enum Direction {
    ENUM_UP(0, -1),
    ENUM_DOWN(0, 1),
    ENUM_RIGHT(1, 0),
    ENUM_LEFT(-1, 0);


    private int x;
    private int y;

    private Direction(int x, int y){    //need to be private!
        this.x = x;
        this.y = y;
    }
    public int getEnumX(){
        return x;
    }
    public int getEnumY(){
        return y;
    }
}
