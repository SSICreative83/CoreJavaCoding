/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Command;

/**
 *
 * @author huijun
 */
public class ShoppingCommand extends Command{

    @Override
    public void execute() {
        System.out.println("zoo");
    }

    @Override
    public void undo() {
        System.out.println("undo zoo");
    }
    
}
