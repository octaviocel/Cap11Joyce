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
public abstract class PhoneCall {
    protected String telefono;
    protected Double precio;

    public PhoneCall(String telefono) {
        this.telefono = telefono;
        this.precio=0.0;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public abstract String getTelefono();
    public abstract Double getPrecio();
    public abstract void information();
    
}
