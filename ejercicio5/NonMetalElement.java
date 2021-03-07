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
public class NonMetalElement extends Element{

    public NonMetalElement(String simbolo, Integer nuAtomico, Double peso) {
        super(simbolo, nuAtomico, peso);
    }
    
    
    @Override
    public void describeElement() {
        System.out.println(String.format("Elemento %s\t Numero Atomico: %d\t Peso: %.2f\nPertenece a los no metalicos y este elemento es"
                + "de este grupo debido a que es mal conductor de electricidad.",
                super.getSimbolo(),super.getNuAtomico(),super.getPeso() ));
    }
}
