/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class StaffDinnerEvent {
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        Event.logo();
        
        
        System.out.println("Dame las caracteristicas de tu evento");
        System.out.println("Numero de evento: ");
        String ev= pen.next();
        System.out.println("Numero de Invitados");
        Integer in= pen.nextInt();
        DinnerEvent.getMenu();
        System.out.println("Escoje un platillo principal");
        int pl= pen.nextInt();
        System.out.println("Guarnicion 1");
        int g= pen.nextInt();
        System.out.println("Guarnicion 2");
        int g2=pen.nextInt();
        System.out.println("Postre");
        int p=pen.nextInt();
        
        DinnerEvent evento = new DinnerEvent(pl,g,g2,p,ev,in);
        
        System.out.println("\n\n");
        evento.mostrar();
        evento.mostrarEmpleados();
        
    }
}
