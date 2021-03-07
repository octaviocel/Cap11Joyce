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
public class DomesticDivision extends Division{
    private String estado;

    public DomesticDivision(String estado, String name, Integer account) {
        super(name, account);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public void display() {
        System.out.println(String.format("Nombre: %s\tCuenta No. %d\nEstado: %s", super.getName(),super.getAccount(),getEstado()));
    }
    
    
}
