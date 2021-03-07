/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import ejercicio10.*;

/**
 *
 * @author DELL
 */
public class Square2 extends GeometricFigure implements SidedObject{

    public Square2(Integer height) {
        super(height, height, "Square");
    }

    @Override
    public Double setArea() {
        return (double) (super.getHeight()*super.getWidth()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displaySides() {
        System.out.println("El cuadrado cada lado mide "+super.getHeight()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
