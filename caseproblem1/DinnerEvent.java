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
public class DinnerEvent extends Event{
    private final static String[] PRINCIPAL={"Mole","Estofado","Cabrito"};
    private final static String[] GUARNICIONES={"Ensalada","Crema Elote","Sopa"};
    private final static String[] POSTRES={"Helado","Platanos fritos","Duraznos en almibar"};

    
    private Integer principal;
    private Integer guarnicion1;
    private Integer guarnicion2;
    private Integer postre;
    private Employee[] empleados;

    public DinnerEvent(Integer principal, Integer guarnicion1, Integer guarnicion2, Integer postre, String nevento, Integer invitados) {
        super(nevento, invitados);
        this.principal = principal;
        this.guarnicion1 = guarnicion1;
        this.guarnicion2 = guarnicion2;
        this.postre = postre;
        this.empleados= new Employee[(meseros(invitados)+bartender(invitados)+1)];
        inicializarEmpleados(meseros(invitados),bartender(invitados));
    }
    
    private void inicializarEmpleados(Integer meseros,Integer bartender){
        Scanner pen = new Scanner(System.in);
        System.out.println("Bienvenido tu evento necesita "+meseros+" meseros "+bartender+" bartender y un coordinador");
        System.out.println("Dame sus datos");        
        for (int i = 0; i < meseros; i++) {
            System.out.println("Mesero No."+(i+1));
            System.out.println("Nombre ");
            String n= pen.next();
            System.out.println("Apellido: ");
            String a= pen.next();
            System.out.println("Identificador number: ");
            int d= pen.nextInt();
            empleados[i]= new Waitstaff(d,a,n);
        }
        for (int i = meseros; i < (meseros+bartender); i++) {
            System.out.println("Bartender No."+((i-meseros)+1));
            System.out.println("Nombre ");
            String n= pen.next();
            System.out.println("Apellido: ");
            String a= pen.next();
            System.out.println("Identificador number: ");
            int d= pen.nextInt();
            empleados[i]= new Bartender(d,a,n);
        }
        System.out.println("Coordinador");
            System.out.println("Nombre ");
            String n= pen.next();
            System.out.println("Apellido: ");
            String a= pen.next();
            System.out.println("Identificador number: ");
            int d= pen.nextInt();
            empleados[meseros+bartender]= new Coordinator(d,a,n);
    }
    
    private Integer meseros(Integer invitados){
        return (invitados/10)+1;        
    }
    private Integer bartender(Integer invitados){
        return (invitados/25)+1;        
    }

    public Integer getPrincipal() {
        return principal;
    }

    public void setPrincipal(Integer principal) {
        this.principal = principal;
    }

    public Integer getGuarnicion1() {
        return guarnicion1;
    }

    public void setGuarnicion1(Integer guarnicion1) {
        this.guarnicion1 = guarnicion1;
    }

    public Integer getGuarnicion2() {
        return guarnicion2;
    }

    public void setGuarnicion2(Integer guarnicion2) {
        this.guarnicion2 = guarnicion2;
    }

    public Integer getPostre() {
        return postre;
    }

    public void setPostre(Integer postre) {
        this.postre = postre;
    }
    
    public static void getMenu(){
        String p= "Mole[1] Estofado[2] Cabrito[3]";
        String g= "Ensalada[1] Crema[2] Elote Sopa[3]";
        String q ="Helado[1] Platanos fritos[2] Duraznos en almibar[3]";        
        System.out.println(String.format("MENU\n%s\n%s\n%s\n", p,g,q));
    }
    
    public void mostrarEmpleados(){
        System.out.println("\n\nServicio de empleados para el evento");
        for (Employee empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }
}
