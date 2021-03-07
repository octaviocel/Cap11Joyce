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
public class Square extends GeometricFigure{

    public Square(Integer height) {
        super(height, height, "Square");
    }

    @Override
    public Double setArea() {
        return (double) (super.getHeight()*super.getWidth()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
