/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author DELL
 */
public class Life extends Insurance{

    public Life() {
        super("Life");
    }
    
    @Override
    public Double setPrecioMensual() {
        return 196.00; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println(String.format("Este seguro es %s con precio mensual de $%.2f", super.getSeguro(),super.getPrecioMensual())); //To change body of generated methods, choose Tools | Templates.
    }
}
