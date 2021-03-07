/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author DELL
 */
public class OutgoingPhoneCall extends PhoneCall{
    protected Integer minutos;

    public OutgoingPhoneCall(Integer minutos, String telefono) {
        super(telefono);
        this.minutos = minutos;
        super.setPrecio(0.4*minutos);
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    @Override
    public void information() {
        System.out.println(String.format("Llamada al telefono %s con precio $%.2f y duracion de %d minutos", getTelefono(),getPrecio(),getMinutos()));
    }

    public Integer getMinutos() {
        return minutos;
    }
    
    
            
}
