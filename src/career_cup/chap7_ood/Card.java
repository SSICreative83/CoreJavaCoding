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
public class Card {
    public enum Suit {
        CLUBS(1), SPADES(2), HEARTS(3), DIAMONDS(4);
        int value;
        private Suit(int v){
            value = v;
        }
    }
    
    private int card;
    private Suit suit;
    
    public Card(int r, Suit s){
        card = r;
        suit = s;
    }
    
    public int value() {
        return card;
    }
    
    public Suit suit() {
        return suit;
    }
}
