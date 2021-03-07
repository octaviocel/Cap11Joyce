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
public class ElementArray {
    public static void main(String[] args) {
        Element[] elementos= new Element[4];
        
        elementos[0]= new MetalElement("C",6,12.0);
        elementos[1]= new MetalElement("O",8,15.99);
        elementos[2]= new NonMetalElement("Au",79,197.0);
        elementos[3]= new NonMetalElement("Pd",46,106.4);
        
        for (int i = 0; i < 4; i++) {
            elementos[i].describeElement();
        }

    }
}
