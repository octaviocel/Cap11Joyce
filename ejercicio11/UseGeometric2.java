/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;



/**
 *
 * @author DELL
 */
public class UseGeometric2 {
    public static void main(String[] args) {
        Square2 cuadrado= new Square2(4);
        Triangle2 triangulo= new Triangle2(3,4);
        
        cuadrado.display();
        cuadrado.displaySides();
        triangulo.display();
        triangulo.displaySides();
    }
}
