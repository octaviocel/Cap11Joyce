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
public class BookArray {
    public static void main(String[] args) {
        Book[] libros= new Book[10];
        
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                libros[i]=new Fiction("Libro"+i);
            }else{
                libros[i]=new NoFiction("Libro"+i);
            }            
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(libros[i].getTitulo()+" $"+libros[i].getPrecio());
        }
    }
}
