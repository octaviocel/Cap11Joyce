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
public class UseGeometric {
    public static void main(String[] args) {
        Square cuadrado= new Square(4);
        Triangle triangulo= new Triangle(3,4);
        
        cuadrado.display();
        triangulo.display();
    }
}
