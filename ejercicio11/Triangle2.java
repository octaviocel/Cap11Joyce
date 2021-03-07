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
public class Triangle2 extends GeometricFigure implements SidedObject{

    public Triangle2(Integer height, Integer width) {
        super(height, width, "Triangulo");
    }
    
    
    
    @Override
    public Double setArea() {
        return (double) ((super.getHeight()*super.getWidth())/2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displaySides() {
        System.out.println("El triangulo mide de base "+super.getWidth()+" y altura "+super.getHeight()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
