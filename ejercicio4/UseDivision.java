/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author DELL
 */
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision i= new InternationalDivision("Mexico","Español","Octavio",124545);
        DomesticDivision d= new DomesticDivision("Oaxaca","Marco",543121);
        
        i.display();
        System.out.println();
        d.display();
        
    }
}
