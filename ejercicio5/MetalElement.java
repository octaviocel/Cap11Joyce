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
public class MetalElement extends Element{

    public MetalElement(String simbolo, Integer nuAtomico, Double peso) {
        super(simbolo, nuAtomico, peso);
    }

    
    @Override
    public void describeElement() {
        System.out.println(String.format("Elemento %s\t Numero Atomico: %d\t Peso: %.2f\nPertenece a los metalicos y este elemento es"
                + "de este grupo debido a que es buen conductor de elertricidad.",
                super.getSimbolo(),super.getNuAtomico(),super.getPeso() ));
    }
    
}
