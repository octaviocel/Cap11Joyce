/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author DELL
 */
public class Audi extends Auto{

    public Audi() {
        super("AUDI");
    }

    
    @Override
    public Double setPrecio() {
        return 200000.0;
    }
    
}
