/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author DELL
 */
public abstract class Element {
    private String simbolo;
    private Integer nuAtomico;
    private Double peso;

    public Element(String simbolo, Integer nuAtomico, Double peso) {
        this.simbolo = simbolo;
        this.nuAtomico = nuAtomico;
        this.peso = peso;
    }
    
    public abstract void describeElement();

    public String getSimbolo() {
        return simbolo;
    }

    public Integer getNuAtomico() {
        return nuAtomico;
    }

    public Double getPeso() {
        return peso;
    }
    
    
}
