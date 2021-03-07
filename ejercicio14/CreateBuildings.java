/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author DELL
 */
public class CreateBuildings {
    public static void main(String[] args) {
        House cas= new House(5,4,280,2);
        School escuela= new School(12,"secundaria",350,1);
        
        System.out.println(cas.toString());
        System.out.println(escuela.toString());
    }
}
