/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Bridge;

/**
 *
 * @author huijun
 */
public class Boy {
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Boy(String name) {
        this.name = name;
    } 
    
    public void pursue(MM mm){
        Gift g1 = new WarmGift(new Flower());
        Gift g2 = new WildGift(new Ring());

        //give(g, mm);
    }
    
    public void give(Gift g, MM mm){
        
    }
}
