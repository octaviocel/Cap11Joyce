/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author DELL
 */
public class Triangle extends GeometricFigure{

    public Triangle(Integer height, Integer width) {
        super(height, width, "Triangulo");
    }
    
    
    
    @Override
    public Double setArea() {
        return (double) ((super.getHeight()*super.getWidth())/2); //To change body of generated methods, choose Tools | Templates.
    }
    
}
