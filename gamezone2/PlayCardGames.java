/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

/**
 *
 * @author DELL
 */
public class PlayCardGames {
    public static void main(String[] args) {
        Poker juego= new Poker();
        Bridge juego2= new Bridge();
        
        juego.displayDescription();
        System.out.println("\n\n");
        juego2.displayDescription();
    }
}
