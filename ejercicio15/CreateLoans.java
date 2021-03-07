/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CreateLoans {
    public static void main(String[] args) {
        ArrayList<Loan> prestamos= new ArrayList();
        
        prestamos.add(new BusinessLoan(12154,"Celaya",20000,5));
        prestamos.add(new BusinessLoan(45611,"Mar",20215,10));
        prestamos.add(new BusinessLoan(84851,"Perez",848485,1));
        prestamos.add(new PersonalLoan(32565,"Rodriguez",62200,3));
        prestamos.add(new PersonalLoan(94611,"Martinez",9000,2));
        
        for (int i = 0; i < prestamos.size(); i++) {
            System.out.println(prestamos.get(i).toString());
        }
            
        
        
    }
}
