/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class FullDeck {

    private ArrayList<Card> baraja;

    public FullDeck() {
        this.baraja = new ArrayList();
        this.inicializar();
    }

    private void inicializar() {
        Integer carta = 1;
        Integer nu = 1;
        for (int i = 0; i < 52; i++) {
            this.baraja.add(new Card(carta, nu));
            nu++;
            if (nu > 13) {
                nu = 1;
                carta++;
            }
        }
    }

    public ArrayList<Card> getBaraja() {
        return baraja;
    }
    
    

    public void mostrar() {
        for (int i = 0; i < 52; i++) {
            System.out.println("Carta: " + baraja.get(i).getCarta() +" "+ baraja.get(i).getNumero());

        }
    }
}
