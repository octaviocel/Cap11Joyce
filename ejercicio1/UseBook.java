/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author DELL
 */
public class UseBook {
    public static void main(String[] args) {
        Fiction libro= new Fiction("El principito");
        NoFiction libro2= new NoFiction("REx");
        
        System.out.println(libro.getTitulo()+"  $"+libro.getPrecio());
        System.out.println(libro2.getTitulo()+"  $"+libro2.getPrecio());
    }
}
