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
public abstract class Employee {
    private Integer identificador;
    private String apellido;
    private String nombre;
    private Double tarifa;
    private String puesto;

    public Employee(Integer identificador, String apellido, String nombre) {
        this.identificador = identificador;
        this.apellido = apellido;
        this.nombre = nombre;
        this.puesto= setPuesto();
        this.tarifa= setTarifa();
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public abstract Double setTarifa();

    public String getPuesto() {
        return puesto;
    }

    public abstract String setPuesto();
    
    @Override
    public String toString(){
        return String.format("Nombre %s %s con identificador %d\nPuesto: %s Cobra %.2f",nombre,apellido,identificador,puesto,tarifa);
    }
    
    
}
