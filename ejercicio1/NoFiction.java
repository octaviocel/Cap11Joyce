/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author DELL
 */
public class NoFiction extends Book{

    public NoFiction(String titulo) {
        super(titulo);
    }

    
    @Override
    public Double setPrice() {
        return 37.99;
    }
    
}
