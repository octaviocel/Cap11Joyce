/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

/**
 *
 * @author DELL
 */
public abstract class Loan implements LoanConstants {

    private Integer noPrestamo;
    private String apellido;
    private Integer prestamo;
    private Double interes;
    private Integer plazo;

    public Loan(Integer noPrestamo, String apellido, Integer prestamo, Integer plazo) {
        this.noPrestamo = noPrestamo;
        this.apellido = apellido;
        if (prestamo > 100000) {
            this.prestamo = 100000;
        } else {
            this.prestamo = prestamo;
        }
        this.plazo = setPlazo(plazo);
        this.interes= setInteres();
        
    }

    public abstract Double setInteres();
    
    private Integer setPlazo(Integer plazo) {
        switch (plazo) {
            case 1:
                return LoanConstants.SHORTTEM;
            case 2:
                return LoanConstants.MEDIUMTERM;
            case 3:
                return LoanConstants.LONGTERM;
            default:
                System.out.println("No existe ese plazo asi que se fuerza a 1");
                return LoanConstants.SHORTTEM;

        }
    }
    
    @Override
    public String toString(){
        return String.format("Prestamo No. %d del Sr./Sra. %s\n Monto %d\t Interes: %.2f\t Plazo: %d", 
                getNoPrestamo(),getApellido(),getPrestamo(),getInteres(),getPlazo());
    }

    public Integer getNoPrestamo() {
        return noPrestamo;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getPrestamo() {
        return prestamo;
    }

    public Double getInteres() {
        return interes;
    }

    public Integer getPlazo() {
        return plazo;
    }

    public static Integer getSHORTTEM() {
        return SHORTTEM;
    }

    public static Integer getMEDIUMTERM() {
        return MEDIUMTERM;
    }

    public static Integer getLONGTERM() {
        return LONGTERM;
    }

    public static String getEMPRESA() {
        return EMPRESA;
    }

    public static Integer getPRESTAMOMAX() {
        return PRESTAMOMAX;
    }

}
