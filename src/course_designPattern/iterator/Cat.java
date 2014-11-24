/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Iterator;

/**
 *
 * @author huijun
 */
public class Cat {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cat(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "cat" + id;
    }
}
