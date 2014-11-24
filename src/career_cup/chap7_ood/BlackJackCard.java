/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap7_OOD;

/**
 *
 * @author huijun
 */
public class BlackJackCard extends Card{
    public BlackJackCard(int r, Suit s){
        super(r, s);
    }
    
    @Override
    public int value() {
        int r = super.value();
        if(r == 1) return 11;//ace is 11
        if(r < 10) return r;
        return 10;
    }
    
    boolean isAce() {
        return super.value() == 1;
    }
}
