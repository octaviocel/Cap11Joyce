/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

/**
 *
 * @author DELL
 */
public class Waitstaff extends Employee{

    public Waitstaff(Integer identificador, String apellido, String nombre) {
        super(identificador, apellido, nombre);
    }

    @Override
    public Double setTarifa() {
        return 10.0; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String setPuesto() {
       return "Mesero"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
