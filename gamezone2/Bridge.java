/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class Bridge extends CardGame{
    private ArrayList<Card> jugador1;

    public Bridge(){
        this.jugador1= new ArrayList();
        deal();
    }
    
    @Override
    public void displayDescription() {
        for (int i = 0; i < jugador1.size(); i++) {
            System.out.println(jugador1.get(i).getCarta()+" of "+jugador1.get(i).getNumero());
        }
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deal() {
        Random random = new Random();
            //Integer randomInt = super.getMazo().get(random.nextInt(545));
            //Card carta= super.getMazo().getBaraja().get(random.nextInt(52));
            //jugador1.add(new Card(carta.getCarta(),carta.getNumero()));
        for (int i = 0; i < 13; i++) {
            //jugador1.add(i, new Card());
            Card carta= super.getMazo().getBaraja().get(random.nextInt(52));
            jugador1.add(new Card(carta.getCarta(),carta.getNumero()));
        }
    }
}
