/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huijun
 */
public class Boy {
   private String name;
   private List<Command> commands = new ArrayList<Command>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Boy(String name) {
        this.name = name;
    } 

    void addCommand(Command c) {
        this.commands.add(c);
    }
    
    public void executeCommands(){
        for(Command c : commands){
            c.execute();
        }
    }
    
    public void undoCommands(){
        //need another list to have executed command
    }
}
