/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author DELL
 */
public class StoryDemo {
    public static void main(String[] args) {
        Story[] hist= new Story[6];
        hist[0]= new Novel();
        hist[0].setLibro("Las cronicas");
        hist[0].setAutor("Jorge Medina");
        hist[1]= new Novel();
        hist[1].setLibro("Las cronicas");
        hist[1].setAutor("Jorge Medina");
        hist[2]= new Novella();
        hist[2].setLibro("Las cronicas");
        hist[2].setAutor("Jorge Medina");
        hist[3]= new Novella();
        hist[3].setLibro("Las cronicas");
        hist[3].setAutor("Jorge Medina");
        hist[4]= new ShortStory();
        hist[4].setLibro("Las cronicas");
        hist[4].setAutor("Jorge Medina");
        hist[5]= new ShortStory();
        hist[5].setLibro("Las cronicas");
        hist[5].setAutor("Jorge Medina");
        
        for (int i = 0; i < 6; i++) {
            System.out.println(hist[i].toString());
        }
        
    }
}
