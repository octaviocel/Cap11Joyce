/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author DELL
 */
public class PartTime extends Student{
    public PartTime(String name) {
        super(name, true);
    }

    
    @Override
    public Integer tarifa() {
        return 200; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void display(){
        System.out.println(String.format("El estudiante %s de medio tiempo paga %d por hora de credito", super.getName(),tarifa()));
    }
}
