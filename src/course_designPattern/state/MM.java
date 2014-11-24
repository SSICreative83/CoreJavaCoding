/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.State;

/**
 *
 * @author huijun
 */
public class MM {
    
    private String name;
    
    private MMState state = new MMHappyState();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public MM(String name) {
        this.name = name;
    }
    
    public void smile(){
        state.smile();
    }
    
    public void cry(){
        state.cry();
    }
    
    public void say(){
        state.say();
    }
}
