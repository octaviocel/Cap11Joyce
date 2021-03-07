/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author DELL
 */
public class Building {
    private Integer pisoscuadrados;
    private Integer pisos;

    public Building(Integer pisoscuadrados, Integer pisos) {
        this.pisoscuadrados = pisoscuadrados;
        this.pisos = pisos;
    }

    public Integer getPisoscuadrados() {
        return pisoscuadrados;
    }

    public void setPisoscuadrados(Integer pisoscuadrados) {
        this.pisoscuadrados = pisoscuadrados;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }
    
    
}
