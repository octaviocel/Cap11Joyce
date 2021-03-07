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
public abstract class Book {
    private String titulo;
    private Double precio;

    public Book(String titulo) {
        this.titulo = titulo;
        this.precio = setPrice();
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getPrecio() {
        return precio;
    }
    
    public abstract Double setPrice();
    
}
