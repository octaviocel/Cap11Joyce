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
public class Bartender extends Employee{

    public Bartender(Integer identificador, String apellido, String nombre) {
        super(identificador, apellido, nombre);
    }

    @Override
    public Double setTarifa() {
        return 14.00; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String setPuesto() {
        return "Bartender"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
