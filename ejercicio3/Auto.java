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
public abstract class Auto {
    private String marca;
    private Double precio;

    public Auto(String marca) {
        this.marca = marca;
        this.precio=setPrecio();
    }

    public String getMarca() {
        return marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public abstract Double setPrecio();
    
    public void information(){
        System.out.println(String.format("el carro marca %s con valor de $%.2f", getMarca(),getPrecio()));
    }
    
}
