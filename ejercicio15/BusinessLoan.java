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
public class BusinessLoan extends Loan{

    public BusinessLoan(Integer noPrestamo, String apellido, Integer prestamo, Integer plazo) {
        super(noPrestamo, apellido, prestamo, plazo);
    }
       

    @Override
    public Double setInteres() {
        return 0.10; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return super.toString()+"\n  El monto total de adeudo es "+((super.getPrestamo()+(super.getInteres()*super.getPrestamo())));
    }
}
