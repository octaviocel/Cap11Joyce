/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import java.util.Collections;
import java.util.List;


/**
 *
 * @author DELL
 */
public abstract class CardGame {
    private FullDeck mazo;
    private Integer cartas;
    
    public CardGame(){
        this.mazo= new FullDeck();
        this.cartas=0;
        shuffle();
    }
    
    private void shuffle(){
        Collections.shuffle(this.mazo.getBaraja());
    }
    
    public abstract void displayDescription();
    public abstract void deal();

    public FullDeck getMazo() {
        return mazo;
    }

    public Integer getCartas() {
        return cartas;
    }
    
    
}
