/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author DELL
 */
public abstract class Insurance {
    private String seguro;
    private Double precioMensual;

    public Insurance(String seguro) {
        this.seguro = seguro;
        this.precioMensual=setPrecioMensual();
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public Double getPrecioMensual() {
        return precioMensual;
    }

    public abstract Double setPrecioMensual();
    public abstract void display();
    
}
