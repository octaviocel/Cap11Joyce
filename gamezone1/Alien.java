/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

/**
 *
 * @author DELL
 */
public abstract class Alien {

    protected Integer eyes;
    protected Integer vidas;
    protected String jerarquia;

    public Alien(Integer eyes, Integer vidas, String jerarquia) {
        this.eyes = eyes;
        this.vidas = vidas;
        this.jerarquia = jerarquia;
    }

    @Override
    public String toString() {
        return "Este Alien tiene " + eyes + " ojos. " + vidas + " vidas y tiene un nivel " + jerarquia;
    }
}
